package day06_operators_2;

import java.util.Scanner;

public class ScanYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi, What is your name?");
		Scanner scan = new Scanner(System.in);
		
		String firstName = scan.next();
		System.out.println("My name is "+ firstName);
	}

}
