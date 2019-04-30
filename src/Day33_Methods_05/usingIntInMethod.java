package Day33_Methods_05;

public class usingIntInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addVoid(2, 5);
		int result = addVoid1(10, 10);
		System.out.println(result);
		double multiply = multiply(2.3, 3.9);
		System.out.println("The result is: " + multiply);
		int minus = minus(10, 2);
		System.out.println("The result is: " + minus);
		int division = division(100, 00);
		System.out.println("The result is: " + division);
	}

	public static void addVoid(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);

	}

	public static int addVoid1(int num1, int num2) {
		int result = num1 + num2;
		return result;

	}
	
	public static double multiply(double num1, double num2) {
		double result = num1*num2;
		return result;
	}
	public static int minus(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
	public static int division(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("ERROR: Cannot / by 0");
			return 0;
		}
		int result = num1/num2;
		return result;
	}
}
