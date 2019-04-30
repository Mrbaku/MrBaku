package day08_Intro_If_Else;

import java.util.Scanner;

public class IfElseUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int passingPercentage = 65;
		System.out.println("What is your score?");
		int myScore = scan.nextInt();
		
		if(myScore>= passingPercentage) {
			System.out.println("Congrats!!");
		}else {
			System.out.println("Next time!");
		}
	}

}
