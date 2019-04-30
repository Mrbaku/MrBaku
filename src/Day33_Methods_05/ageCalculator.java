package Day33_Methods_05;

public class ageCalculator {

	public static void main(String[] args) {
	
	int age = calculateAge(1963);
	System.out.println(age);
	
	int age2 = calculateAge(1991);
	System.out.println("You are " + age2 + " years old");

	}

	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		if (age < 0) {
			System.out.println("Invalid age");
			return 0;
		}else if(age <=14) {
			System.out.println("Child");
		}else if(age>=15 && age<= 25) {
			System.out.println("Youngster");
		}else if(age >= 26 && age<= 64) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior");
		}
		return age;
	}
}
