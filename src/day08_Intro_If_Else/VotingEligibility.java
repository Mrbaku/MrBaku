package day08_Intro_If_Else;

import java.util.Scanner;

public class VotingEligibility {
        public static void main(String [] args) {
            Scanner scan=new Scanner(System.in);
             System.out.println("What is your age?");
            int votingAge=18;
            
            int yourAge=scan.nextInt();
            
            int youHave=votingAge-yourAge;
            
        if(yourAge>votingAge) {
            System.out.println("You are eligible to for vote");
            System.out.println("You have been eligible for "+(-youHave)+" years.");
            
            
        }    else {System.out.println("You are not eligible to vote. " +"\n"+"You have "+youHave+" more years.");}
        
        }

		
	}


