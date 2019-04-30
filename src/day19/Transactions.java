package day19;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		double balance=100;
		double amount;
		int n=1;
		String answer="";
		
		System.out.println("Transaction number "+n+" What is transaction amount?");
		amount=scan.nextDouble();
		balance-=amount;
		if(balance<=0) {System.out.println("Warning your balance going to negative. Do you still want to contuniue?");
		answer=scan.next(); 
		if (answer.equalsIgnoreCase("yes")) {System.out.println("You are broke"+"\n"+"Balance: "+balance);}else
			if (answer.equalsIgnoreCase("no")); {System.out.println("Thank you to visit");
			System.exit(0);}}
		System.out.println("Balance:"+balance);
		
		
		while (balance>0) {n++;System.out.println("Transaction number "+n+" What is transaction amount?");
		amount=scan.nextDouble();
		balance-=amount;
		
		if(balance<=0) {System.out.println("Warning your balance going to negative. Do you still want to contuniue?");
		answer=scan.next(); 
		if (answer.equalsIgnoreCase("yes")) {System.out.println("You are broke"+"\n"+"Balance: "+balance);}else
			if (answer.equalsIgnoreCase("no")); System.out.println("Thank you to visit");
			System.exit(0);}else
		
{System.out.println("Balance:"+balance);}}
		
		

	}

}
