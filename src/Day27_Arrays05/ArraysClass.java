package Day27_Arrays05;

import java.util.*;
public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {45,55,56,1,2,3};
		//toString Method
		Arrays.toString(nums);
		System.out.println(Arrays.toString(nums));
		
		//sort method
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic", "Uzbek"};
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		//largest, smallest number
		int [] nums2 = {345,665,3333,11,3,66,0};
		Arrays.sort(nums2);
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		
		System.out.println("Lowest number: " + lowest);
		System.out.println("Highest number: " + largest);
		
	}

}
