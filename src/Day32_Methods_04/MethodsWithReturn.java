package Day32_Methods_04;

public class MethodsWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * this method, returns int value
		 */
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: " + i);
		System.out.println(giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("My name is: " + giveMeYourName());
	}
	public static int giveMe10$() {
		System.out.println("Returning 10 from method");
		return 10;
	}
	
	/*
	 * giveMeYourName();
	 * return  type: String
	 * Declare name variable and assign your name then return it
	 */
	public static String giveMeYourName() {
		System.out.println("Returning Name from method");
		return "Orhan";
	}
	
}
