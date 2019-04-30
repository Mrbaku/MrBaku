package Day33_Methods_05;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(usingIntInMethod.addVoid1(3, 5));	
	System.out.println(usingIntInMethod.division(100, 25));
	System.out.println(usingIntInMethod.minus(100, 25));
	
	int addResult = usingIntInMethod.addVoid1(21, 41);
	double mResult = usingIntInMethod.multiply(50, 40);
	int miResult = usingIntInMethod.minus(3000, 200);
	int dResult = usingIntInMethod.division(455, 5);
	
	System.out.println("The result is: " + addResult);
	System.out.println("The result is: " + mResult);
	System.out.println("The result is: " + miResult);
	System.out.println("The result is: " + dResult);
	
	int a = 10, b=5;
	int myResults = usingIntInMethod.minus(a,b);
	System.out.println("My result is: " + myResults);
	
	int [] dNums = {2,5};
	double results2 = usingIntInMethod.multiply(dNums[0], dNums[1]);
	System.out.println("Results 2: " + results2);
	}

}
