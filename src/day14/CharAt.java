package day14;

import java.util.Scanner;

public class CharAt {
	public static void main (String [] args) {
		String word="Computer";
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
//
		String word2="orxan";
		if (word2.charAt(0)=='j') {System.out.println("J is 1st char");}else {System.out.println("J is not first case");}
		
		Scanner scan= new Scanner (System.in);
		String word3="civic";
		char first=word3.charAt(0);
		char last=word3.charAt(4);
		
		if(first==last) {System.out.println("First and last match");}else
		{System.out.println("First and last doesn't match");}
		
		
		String word4= "asdsdfbwf";
		
		char lastChar= word4.charAt(word4.length()-1); //shows the last character in the word
		System.out.println(lastChar);
		
		
		

	}

}
