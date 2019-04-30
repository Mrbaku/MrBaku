package Day34_methods_06;

import java.util.Arrays;
import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method: findOccurances
		// Return type: int
		// params: int [] array, int value
		// Methods will look for value in the array return the count of occurances
		// to count how many numbers in the array
		int[] nums = { 1, 2, 3, 4, 5, 5, 5, 66, 6, 6 };
		int fives = findOccurances(nums, 5);
		int sixes = findOccurances(nums, 6);
		System.out.println(fives);
		System.out.println(sixes);

		if (fives > 0) {
			System.out.println("We have 5's");
		} else {
			System.out.println("no 5's");
		}

		getArray();
		getRandomArray(100);

	}

	public static int findOccurances(int[] arr, int value) {
		int counter = 0;
		for (int num : arr) {
			if (num == value) {
				counter++;
			}
		}
		return counter;

	}

	public static int[] getArray() {
		int[] value = { 5, 6, 6, 6, 6 };
		return value;
	}

	public static int[] getRandomArray(int size) {
		Random r = new Random();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = r.nextInt(100);
		}
		return array;

	}
}
