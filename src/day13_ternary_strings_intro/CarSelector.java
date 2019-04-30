package day13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {
	public static void main(String [] args) {
		double averagePrice=0;
		String carOptions = null;
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Enter your car type: \n1) American \n2) Japanese \n3) German \n4) Italian \n5) Korean");
		int carType=scan.nextInt();
		
		switch(carType) {
		case 1:
			 averagePrice=33000;
			carOptions="You have selected American cars and your options are Ford, Dodge, Tesla, Lincoln";
			
		case 2:
			averagePrice=34000;
			carOptions="You have selected Japanese cars and your options Nissan, Honda, Mazda, Mitsibushi";
			
		case 3:
			averagePrice=55000;
			carOptions="You have selected German cars and your options Bmw, VW, Audi, Mercedes, Porsche";
			
		case 4:
			averagePrice=85000;
			carOptions="You have selected Italian cars and your options  Alfa Romeo, Ferrari, Lamborghini, Fiat";
			
		case 5:
			averagePrice=25000;
			carOptions="You have selected Korean cars and your options  Kia, Hyundai, Daewoo";
			
			default: 
				System.out.println("Not such a selection");
			
		}
		
		System.out.println(carOptions);
		System.out.println("Average Price: "+averagePrice);
		
	}

}
