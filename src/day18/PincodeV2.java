package day18;

import java.util.Scanner;

public class PincodeV2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String name="fuad";
		int age=25;
		String reference=name.substring(0,2)+age;
		System.out.println(reference);
		
		int secretPincode=1234;
		
		int pincode=0;
		int n=1;
		
		while(pincode!=9498 &&  n<4) {
			System.out.println("Enter pincode");
			
			pincode=scan.nextInt();
			
			n++;
			
			
		}
		if (n==4&&pincode!=9498) {System.out.println("Too many wrong attemps");}else
		
		{System.out.println("Acces granted, select operation"); }
		
		
	}

}
