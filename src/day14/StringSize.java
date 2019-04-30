package day14;

import java.util.Scanner;

public class StringSize {

	public static void main(String[] args) {

		String str1="Good Morning";
		//check if it matches "Good Morning" and print match or not match
		
		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		}else
		{System.out.println("Not Match");}
		
		
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match");
		}else
		{System.out.println("Not Match");}	
		
		System.out.println(str1.toUpperCase()); //toUpperCase
		
		System.out.println(str1);
		str1=str1.toUpperCase();
		System.out.println(str1);
		
		
		if(str1.toLowerCase().equals("good morning")) {System.out.println(true);}else {System.out.println(false);}
		
		String myName="fuad";
		System.out.println(myName.length());
		
		int length=myName.length();
		System.out.println("I have "+length+" apple.");
		
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("Enter 2 words:");
		String word1=scan.next();
		String word2=scan.next();
		
		//if(userName.length()== 8) {System.out.println("Good username");}else {System.out.println("invalid username");}
		
	/*	if(word1.length()>word2.length()) {System.out.println(word1+" is longer");}else
			if(word2.length()>word1.length()) {System.out.println(word2+" is longer");}else
				if(word1.length()==word2.length()) {System.out.println(word1+" and "+word2+" are same length");}*/
		
		
		
	}

}
