package Day48_inheritance01;

public class Employee extends Person {

	String jobTitle;
	
	public void work() {
		System.out.println(name+ " is working as " + jobTitle);
	}

	
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	

}
