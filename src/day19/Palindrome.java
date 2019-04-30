package day19;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		
		String word="Bojob";
		String reversed="";
		
		
		System.out.println("Enter word");
		word=scan.next();
		int c= word.length()-1;
		
		
		while(c>=0) {
		char n = word.charAt(c);
		c--;
		reversed+=n;
		
		
		
		}
		System.out.print(reversed);
		System.out.println();
if (reversed.equalsIgnoreCase(word)) {System.out.println("It is palindrome");}else {System.out.println("No it is not palindrome");}
	}

}
