package Day24_Arrays_Continued;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMW, Audi, ford, Honda, Mercedes, Mercury, Rolls Royce
		// 1 create an array of string, and store these cars insode the array

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		// 2 print car names that start with M

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].startsWith("M")) {
				System.out.println(cars[i]);
			}

		}
		// 3 print all cars that contains letter "r" somewhere in the name
		for (String car : cars) {
			if (car.toLowerCase().contains("r")) {
				System.out.println(car);
			}
		}
		//4 print car names that ends with "a"
		for (String car : cars) {
			if (car.endsWith("a")) {
				System.out.println(car);
			}
		}
		//5 print all cars that have at least 6 letters
		
		for (String car : cars) {
			if (car.length()>=6) {
				System.out.println(car);
			}
		}
		//6 Swap first and last value in the array
		String temp = cars[0];
		cars[0] = cars[cars.length-1];
		cars[cars.length-1] = temp;
		System.out.println(Arrays.deepToString(cars));
	
	}
}
