package Day27_Arrays05;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int [] nums = {4,10,20,50,65};
		Arrays.binarySearch(nums,10);
		System.out.println("Number is: " +Arrays.binarySearch(nums,5));
		
		int nums1 = Arrays.binarySearch(nums, 65);
		System.out.println(nums1);
		
		
		int [] nums2 = {4,103,44,50,65};
		Arrays.binarySearch(nums2,103);
		System.out.println("Number is: " +Arrays.binarySearch(nums2,103));
	}
}
