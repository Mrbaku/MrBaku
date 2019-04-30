package Day23_Arrays_Started;

import java.util.Scanner;

public class Warm_Up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		   System.out.println("Enter your number");
		int itsPrime =0;
	        int prime = scan.nextInt();
	        for (int i = 1; i <= prime; i++ ) {
	            if (prime%i == 0) {
	                itsPrime++;
	            }
	        }
	        if (itsPrime == 2) {
	            System.out.println("It's prime number");
	        } else {
	            System.out.println("It's not prime number");
	        }
	}

}
