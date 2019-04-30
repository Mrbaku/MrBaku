package day12;

import java.util.Scanner;

public class SwitchChar {
	public static void main (String[] args){
	
	
	//A or B or C -> Pass    D , E -> Fail   Invalid grade
	
	Scanner scan = new Scanner(System.in);
	char grade = scan.next().charAt(0);
	
	switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
	}
	}
}
