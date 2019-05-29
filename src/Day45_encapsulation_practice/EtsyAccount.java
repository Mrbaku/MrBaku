package Day45_encapsulation_practice;

import java.util.Random;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String passWord;

	// constructor1
	public EtsyAccount() {
		email = "";
		firstName = "";
		passWord = "";
		System.out.println("One-Args constructing");
	}

	// constructor 2
	// take 3 args and set them to instance variables using setters

	public EtsyAccount(String email, String firstName, String passWord) {
		setEmail(email);
		setFirstName(firstName);
		setPassWord(passWord);
	}

	// constructor 3
	// Email, firstName
	// oassword is auto generated and assigned

	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.passWord = getRandomPassword();
	}

	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";

		for (int i = 0; i < 7; i++) {
			rdPassword += letters.charAt(rd.nextInt(letters.length()));
		}
		return rdPassword;

	}

	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", passWord=" + passWord + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		// if it contains "@" somewhere in the middle, assign it

		if (email.indexOf('@') > 0 && email.indexOf('@') < email.length() - 1) {
			this.email = email;
		} else {
			System.out.println("Please enter a valid email adress");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		// cant be blank
		// needs to be only alphabetic

		this.firstName = firstName;
	}

	private boolean isValidFirstName(String firstName) {

		// check first if it starts with or ends with space
		// return false if true
		if (firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}

		if (firstName.isEmpty()) {
			System.out.println("Cannot be blank.");
			return false;
		}
		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}
		return true;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		if (passWord.length() < 6) {
			System.out.println("Must be at least 6 characters");
		} else {
			this.passWord = passWord;
		}

	}

}
