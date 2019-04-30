package day09_stringequals_conditions;

import java.util.Scanner;

public class Canada {
		public static void main(String [] args) {
			Scanner scan=new Scanner(System.in);
			
			
			String capital="Ottawa"; 
			System.out.println("Where is the capital of Canada?");
		    String answer=scan.next();
			
			if(answer.equalsIgnoreCase(capital)) {System.out.println("Your answer is correct.");} else {System.out.println("Yor answer is incorrect!");}
			
		}
}
