package day20_forloop;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using for loop: 1-100;
		//print all even numbers in the same line
		for(int i = 1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//print all odd numbers
		for(int x = 1; x<=100; x++) {
			if(x%2 !=0) {
				System.out.print(x + " ");
			}
		}
		//sumOfOdds, sumOfEvens - calculate them, print them out after the loop;
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		
		for(int y = 1; y<=100; y++) {
			if(y % 2 == 0) {
				sumOfEvens+= y;
				System.out.println("The sum of even numbers are: " + sumOfEvens);
			}else {
				sumOfOdds+= y;
				System.out.println("The sum of odd numbers are: "+ sumOfOdds);
			}
				
		}
		
		
	
	}

}
