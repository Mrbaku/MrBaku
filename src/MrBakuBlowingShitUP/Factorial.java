package MrBakuBlowingShitUP;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

	int i,fact=1;
	int number=scan.nextInt();//It is the number to calculate factorial.
	for(i=1;i<=number;i++){
		fact=fact*i;
}
	System.out.println("Factorial of "+number+" is: "+fact);
	}

}
