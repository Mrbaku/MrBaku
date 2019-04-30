package day20_forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		//check if its valid or if its not valid just return;
		if(num < 1 || num > 10 ) {
			System.out.println("### ERROR ### Invalid input");
			return;
		}
		for(int xxx = 1; xxx<=10; xxx++) {
			System.out.println(num + " x " + xxx + " = " + (num*xxx));
			
		}
			
		}
				
	}

int minValue = int.MIN_VALUE