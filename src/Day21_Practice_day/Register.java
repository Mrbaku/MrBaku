package Day21_Practice_day;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, how many items are you purchashing?");
		
		int itemsCount= scan.nextInt();
		double totalPrice = 0;
		String items= "";
		
		
		for(int i = 1; i <= itemsCount; i++) {
			System.out.println("What is item " + i + "?");
			String ItemName = scan.next();
		}
	}

}
