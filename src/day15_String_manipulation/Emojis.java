package day15_String_manipulation;

import java.util.Scanner;

public class Emojis {
	public static void main(String [] args) {
		Scanner scan=new Scanner (System.in);
		
		String emoji=scan.nextLine();
		
		char f=emoji.charAt(0);
		char s=emoji.charAt(1);
		
		if (emoji.length()!=2) {System.out.println("Invalid emoji");return;}
		
		  if (f==':') {if (s==')') {System.out.println("smile");}} else
			
			 if(f==':') {if (s=='(') {System.out.println("sad");}}else
				
				if (f==':') {if (s=='p') {System.out.println("playful");}} else
					
					if (f==';') {if (s==')') {System.out.println("wink");}}else
						
						if (f==':') {if (s=='0') {System.out.println("suprised");}}else
							
							if (f=='(') {if (s==':') {System.out.println("smile");}}else
								
								if (f==')') {if (s==':') {System.out.println("sad");}}
									
								 else
									
									{System.out.println("Invalid emoji");}
	
		
	}

}
