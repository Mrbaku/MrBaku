package day08_Intro_If_Else;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
        
        System.out.println("What is your grade?");
        
        char grade=scan.next().charAt(0);
        
     if(grade=='A') {
         System.out.println("Excellent job! Keep it up");
        
     }else {System.out.println("How many points did you miss for"+' A');
     int points=scan.nextInt();
     System.out.println("You need "+points+" points "+"become successful");
     }
	}

}
