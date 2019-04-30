package Day30_Methods02;

import java.util.Scanner;

public class rangePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rangeprint();
		rangeprint();
		rangeprint();
	}

	public static void rangeprint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		if (num < num2) {
			for (int i = num; i <= num2; i++) {
				System.out.print(i + " ");
			}

		} else if (num > num2) {
			for (int k = num; k >= num2; k--) {
				System.out.print(k + " ");
			}
		} else {
			System.out.println(num);
		}
		System.out.println();
	}
}
