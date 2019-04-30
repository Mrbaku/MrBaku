package day20_forloop;

import java.util.Scanner;

public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = "computer programming";
		char myChar = 'a';
		int counter = 0;
		for(int x =0; x < word.length(); x++) {
			if(word.charAt(x) == myChar) {
				counter++;
			}
		}
		System.out.println("Count: " + counter);
	
	}

}
