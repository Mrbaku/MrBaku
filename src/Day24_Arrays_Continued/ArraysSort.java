package Day24_Arrays_Continued;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] lotteryNumbers = { 12, 45, 3, 62, 42, 90 };
		System.out.println((Arrays.toString(lotteryNumbers)));

		Arrays.parallelSort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));

		int index = Arrays.binarySearch(lotteryNumbers, 90);
			System.out.println("Position: " + index);
	}

}
