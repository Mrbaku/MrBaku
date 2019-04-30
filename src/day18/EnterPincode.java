package day18;

import java.util.Scanner;

public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan= new Scanner(System.in);
			
			int secretPincode=1234;
			
			int pincode=0;
			int n=0;
			
			while(pincode!=9498 &&  n<4) {
				System.out.println("Enter pincode");
				
				pincode=scan.nextInt();
				
				n++;
				
				
			}
			System.out.println("Too many wrong attemps");
			
			System.out.println("Acces granted, select operation");
			
			
	}

}
