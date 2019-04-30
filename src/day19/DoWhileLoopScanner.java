package day19;

import java.util.Scanner;

public class DoWhileLoopScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		String password="abc123";
		String input;
		
		do {
			System.out.println("Enter password");
			input=scan.next();
		}while(!input.equals(password));
		
		System.out.println("YAY");
	}

}
