package Day31_Methods_03;

import java.util.Scanner;

public class MethodCalculator {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub

		add(2,5);
		subs(100, 34.5);
		divide(45, 9);
		remainder(1233,33);
		multiplication(2333, 34);
		Scanner scan = new Scanner(System.in);
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation : '+', '-', '*', '/', '%'");
		String operator = scan.next();
		
		switch(operator){
		case "+":
			add(n1, n2);
		break;
		case "-":
			subs(n1, n2);
		break;
		case "*":
			multiplication(n1, n2);
		break;
		case "/":
			divide(n1, n2);
		break;
		case "%":
			remainder(n1, n2);
		break;
		default:
			System.out.println("invalid operator");
		break;
	}
	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result:" + result);
	}

	public static void subs(double num1, double num2) {
		double result = num1- num2;
		System.out.println("Result:" + result);
	}

	public static void divide(double num1, double num2) {
		if(num2 ==0) {
			System.out.println("cannot/ by zero");
			return;
		}
		double result = num1 / num2;
		System.out.println("Result:" + result);
	}

	public static void remainder(double num5, double num6) {
		double result = num5 % num6;
		System.out.println("Result:" + result);
		
	}

	public static void multiplication(double num5, double num6) {
		double result = num5 * num6;
		System.out.println("Result:" + result);
	}

}
