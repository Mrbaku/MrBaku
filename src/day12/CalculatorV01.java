package day12;

import java.util.Scanner;

public class CalculatorV01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1=scan.nextDouble();
		
		System.out.println("Enter second number");
		double num2=scan.nextDouble();
		
		System.out.println("Select operator +, -, *, /, %");
		String operator=scan.next();
		
		if(operator.equals("+")) {System.out.println(num1+num2);}else
			if(operator.equals("*")) {System.out.println(num1*num2);}else
				if(operator.equals("-")) {System.out.println(num1-num2);}else
					if(operator.equals("/")) {System.out.println(num1/num2);}else
						if(operator.equals("%")) {System.out.println(num1%num2);}else
						{System.out.println("Invalid operator: "+operator); return;/* Do not execute remaining code */}
						
		  
	}

}
