package day19_loops;

public class DoWhile {

	public static void main(String[] args) {

		int x = 1;
		
		do {
			System.out.println(x + ", ");
			x++;
		}while(x<=10);
	
	/////////////////////////////////////////
		int sum = 0;
		int j = 1;
		
		do {
			sum= sum+j;
			j++;
		}while(j<=50000);
		
		System.out.println("Sum from 1 to 5 is " +sum);
	
		
		
	}

}
