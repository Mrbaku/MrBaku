package day19_loops;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		System.out.println("What is your current balance?");
		Scanner scan = new Scanner(System.in);
		double balance = scan.nextDouble();
		int count =0;
	
	while(balance > 0) {
		count++; //increase transcation by 1
		System.out.println("What is transaction amount #" +count+ " amount?");
		double transcation = scan.nextDouble();
		if(transcation>balance) {
			System.out.println("Your balance is about to be negative due to this transcation");
		}
		balance-= transcation;
		System.out.println("Current balance:" +balance);
	}
	System.out.println("You are broke! " +balance );
	System.out.println("Transcations total count: " +count);
	
	
	
	
	
	//needs to keep track of transactions count
	//if any transactions is about to make balance negative or 0, it needs to print a warning
	//after every transaction, program should display the remaining balance
	
	}
		

	}

