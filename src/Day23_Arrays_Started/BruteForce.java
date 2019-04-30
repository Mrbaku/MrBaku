package Day23_Arrays_Started;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;
		
		do {
			if(attempts -- ==0) {
				System.out.println("Ypu have exceeded number of attemps");
				System.out.println("This user has been deactivated");
				return;
			}
			attempts--;
			System.out.println("Please enter user name");
			username = scan.next();
			if(!username.equals(expectedUserName)) {
				System.out.println("Wrong username");
				System.out.println("Attempts left: " + attempts);
				continue;
			}
			System.out.println("Please enter password");
			password = scan.next();
			if(!password.equals(expectedPassword)) {
				System.out.println("Wrong passcode");
				System.out.println("Attempts left: " + attempts);
			}
			
			
		}while(!username.equals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login successfull");
	}

}
