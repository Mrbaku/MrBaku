package Day21_Practice_day;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask user to enter 2 Ints;
		//if sum of those ints is not more than 100, then keep asking for 2 nums;
		//once sum of those 2 numbers is more than 100 then print "Good Numbers"
		//program ends
		Scanner scan = new Scanner(System.in); 
		int sum = 0;
		//int sumOfsums=0;
		
		do {
			System.out.println("Enter 2 numbers");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1 +num2;
			//sumOfsums += sum;
		}while(sum <=100);
		System.out.println("Good Numbers");
	
	}

}
