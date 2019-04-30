package day19;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
public static void main(String[] args) {
	
	 Scanner scan= new Scanner(System.in);
	 Random random=new Random();
	 
	 int secretNumber=15;
	 int guessNumber=0;
	 
	 System.out.println("### WELCOME TO THE GAME ###");
	 secretNumber=random.nextInt(101);
	 
	 do {
		 System.out.println("Enter guess number");
		 guessNumber=scan.nextInt();
		 if (guessNumber==secretNumber) {System.out.println("Bingo, Congratulations you won!"); System.exit(0);}else

			 if (guessNumber<secretNumber) {System.out.println("Your number is too small");}else
		 
		 		if (guessNumber>secretNumber) {System.out.println("Your number is too large");}

	 }while(guessNumber<101);
	 
}
}
