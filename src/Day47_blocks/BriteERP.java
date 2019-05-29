package Day47_blocks;

import java.time.LocalDateTime;

public class BriteERP {
	
	static {
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + TestData.url);
		
	}
	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}
	public static void enterPass() {
		System.out.println("Enter password: " + TestData.password);
	}
	public static void verifyLogIn() {
		System.out.println("Expected name: " + TestData.username);
		System.out.println("Actual name displayed: Victoria");
		System.out.println("Login Successful: " + LocalDateTime.now());
	}
	
}
