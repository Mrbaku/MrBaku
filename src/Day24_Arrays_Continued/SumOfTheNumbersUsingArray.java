package Day24_Arrays_Continued;

import java.util.Arrays;

public class SumOfTheNumbersUsingArray {

	public static void main(String[] args) {
		// Create an array of intergers with length of 3;
		int numbers[] = new int[3];

		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;

		// find the sum of numbers in the array
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println("Sum: " + sum);

		// find largest value in the array;
		int max = Integer.MIN_VALUE;
		for (int x = 0; x < numbers.length; x++) {
			if (numbers[x] > max) {
				max = numbers[x];
			}
		}
		System.out.println("Max value: " + max);
		// find the lowest value in the array
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < numbers.length; k++) {
			if (numbers[k] < min) {
				min = numbers[k];
			}
		}
		System.out.println("Min value: " + min);

	}

}
