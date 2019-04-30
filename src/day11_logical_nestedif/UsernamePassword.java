package day11_logical_nestedif;

import java.util.Scanner;

public class UsernamePassword {
		public static void main(String [] args) {
			
			
			Scanner scan= new Scanner (System.in);
			String validUsername, validPassword, userName, password;
			
			validUsername="cyberttek@gmail.com";
			validPassword="WoodenSpoon123";
			
			System.out.println("Eneter your username"); 
			userName=scan.next();
			System.out.println("Eneter your password");
			password=scan.next();
			
			if(userName.equalsIgnoreCase(validUsername)&&password.equals(validPassword)) {System.out.println("Login successful, Welcome");}else
				if(userName.equalsIgnoreCase(validUsername)&&password!=validPassword) {System.out.println("Invalid Password");} else
			if(userName!=validUsername && password.equals(validPassword)) {System.out.println("Invalid Username");}else
				if(userName!=validUsername&&password!=validPassword) {System.out.println("Invalid Username and Invalid password");}
			
			
		}
}
