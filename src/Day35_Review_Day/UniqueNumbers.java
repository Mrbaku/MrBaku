package Day35_Review_Day;

import java.util.Arrays;

public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [] array and we need to print unique numbers
		// in main method
		// void method that accepts
		int[] nums = { 3, 4, 5, 3, 9, 9, 7, 7 };
		int[] nums1 = { 10, 4, 4 };
		System.out.println(Arrays.toString(nums));
		findUnique1(nums1);

	}

	public static void findUnique(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}

			}
			if (counter == 0) {
				System.out.println(temp);

			}
		}
	}

	public static void findUnique1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}

			}
			if (counter == 0) {
				System.out.println(temp);

			}
		}
	}

	public static int[] findUnique2(int[] nums) {
		int counter = 0;
		String result = "";
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = 0; j <= nums.length - 1; j++) {
				if (nums[i] == nums[j]) {
					counter++;
				}
			}
			if (counter == 1) {
				result += nums[i] + " ";
			}
			counter = 0;
		}
		String[] arr = result.split(" ");
		int[] res = new int[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			res[i] = Integer.parseInt(arr[i]);
		}
		return res;
	}

	public static int[] findUnique3(int[] nums) {
		int uniqueCount = 0;
		int[] uniqueArray = new int[uniqueCount];
		int idx = 0;
		// and loop through again and assign unique numbers
		for (int i = 0; i < nums.length; i++) {// outer loop

			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {// inner/nested loop
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				uniqueArray[idx] = temp;
				idx++;
			}
		}

		// return the array
		return uniqueArray;

	}

}
