
package day34_methods06_varargs;

import java.util.*;

import Day34_methods_06.CountArray;

public class MainArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));

		int[] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));

		int[] nums1 = CountArray.getRandomArray(10);
		System.out.println(Arrays.toString(nums1));

	}
}