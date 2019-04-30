package Day31_Methods_03;

import java.util.Scanner;

public class countUp {

	public static void main(String[] args) {
		countUp(10);
		countDown(20);
		countUp(10);
		countDown(10);

	}

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid input");
		}
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}
		System.out.println();

	}

	public static void countDown(int num1) {
		for (int i = num1; i >= 0; i--) {
			System.out.print(i + " ");

		}
		System.out.println();

	}
}
