package Day27_Arrays05;

import java.util.Arrays;

public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 34, 56, 23, 1, 55 };
		int[] nums2 = Arrays.copyOf(nums1, nums1.length + 2);
		System.out.println(Arrays.toString(nums2));

		int[] brandNew = { 34, 23, 54, 23 };
			System.out.println("Length Before: " + brandNew.length);
		brandNew = Arrays.copyOf(brandNew, brandNew.length +5);
			System.out.println("Length After: " + brandNew.length);
	}

}
