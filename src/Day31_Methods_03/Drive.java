package Day31_Methods_03;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		drive("Audi", 60);

	}
	public static void drive(String car, int speed) {
		Scanner scan = new Scanner(System.in);
		System.out.println(car + " is driving " + speed + " mph");
		
	}
}
