package Day32_Methods_04;

import java.util.Arrays;

public class ArraysParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * method: printArray 
		 * param: int[] nums
		 * return type: void print values of the
		 * nums array
		 */
		int[] myArray = { 44, 22, 66, 11 };
		printArray(myArray);
		printArray(new int[] { 33, 44, 5, 66, 7 });
		printArray(new int[] { 3, 4, 5, 6, 5, 6, 44 });

		int[] one = { 10, 2, 3, 4, 0, 0 };
		int[] two = { 32, 4, 23, 2, 1, 0 };
		print2Arrays(one, two);
		
		print2ArraysV2(one,two);

	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	/*
	 * Method name: print2Arrays 
	 * Return: void 
	 * params: 2 int arrays it prints the
	 * larger array followed by the smaller array
	 * 
	 */

	public static void print2Arrays(int[] a, int[] b) {
		if (a.length > b.length) {
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
		} else {
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(a));
		}
	}

	public static void print2ArraysV2(int[] a, int[] b) {
		if (a.length > b.length) {
			printArray(a);
			printArray(b);
		} else {
			printArray(b);
			printArray(a);
		}
	}
}
