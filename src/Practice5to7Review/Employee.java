package Practice5to7Review;

public class Employee {

	String firstName;
	String lastName;
	//class is a blueprint
	//object is an instance of class
	int employee_id;
	int age;
	float hourly_rate;
	char gender;
	boolean isInsured;
	String title;
	String email;
	
	
	public void printInfo() {
		System.out.println(" First Name: " + firstName+ ", Last Name: " + lastName+ ", Employee id: " +employee_id
						+ ", Age: " + age+ ", Hourly Rate: " + hourly_rate + ", Gender: " + gender + ", Insured?: " + isInsured
						+ ", Title: " + title + " Email: " + email);
	}	

}
