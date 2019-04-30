package Day31_Methods_03;

import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String password = scan.next();
		login(name, password);
		
	}
	public static void login(String username, String password) {
		System.out.println("Enter your username");
		
		
		Scanner scan = new Scanner(System.in);
		
		
		String validUsername = "mentoring@cybertek.com";
		String validPassword = "mentor001";
		
		if(username.equalsIgnoreCase(validUsername) ) {
			System.out.println("Login Successful! Welcome to Okta!");
		}else {
			System.out.println("Signin Failed!");
		} if(password.equalsIgnoreCase(validPassword) ) {
			System.out.println("Enter your password");
			System.out.println("Login Successful! Welcome to Okta!");
		}else {
			System.out.println("Signin Failed!");
	}
}
}
