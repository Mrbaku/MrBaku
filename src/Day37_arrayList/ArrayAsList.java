package Day37_arrayList;

import java.util.*;

public class ArrayAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cars = new ArrayList<>();
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());

		List<Double> prices = Arrays.asList(12.4, 5.2, 500.0, 1230.50, 5.99, 12.0, 9874.44, 34.4, 123.5, 69.69);
		System.out.println(prices.toString());

		double sum = 0;
		for (double price : prices) {
			sum += price;
		}
		System.out.println("Sum: " + sum);

		double sum1 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum1 += prices.get(i);

		}
		System.out.println("Sum: " + sum1);

		// create new List<Double> called expensive
		// add prices that are more than 100 from prices list
		List<Double> expensive = new ArrayList<>();

		for (double price : prices) {
			if (price > 100.0) {
				expensive.add(price);
			}
		}

		System.out.println("Expensive: " + expensive.toString());
		
		
		
	}
}
