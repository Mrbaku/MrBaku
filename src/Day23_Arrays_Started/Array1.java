package Day23_Arrays_Started;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= new int[3];
		
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		for(int i = 0; i < numbers.length; i++) {
		System.out.println("*****************");	
			System.out.println(numbers[i]);
		
		}

	}

}
