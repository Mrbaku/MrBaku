package Day30_Methods02;

public class StudentsAtSchool {

	public static void main(String[] args) {
		
		study("Agile");
		study("API automation");
		study("HTML");
		sleep(5);
	}
	public static void study(String topics) {
		System.out.println("Student is studying " + topics);
	}
	public static void sleep(int hours) {
		System.out.println("Student is sleeping for " + hours + " hours.");
	}
}

