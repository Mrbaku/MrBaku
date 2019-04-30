package Practice5to7Review;

import java.util.Arrays;

public class IntArray {
public static void main(String[] args) {
	int [] nums = {15, 10, 20, 18, 30};
	
	System.out.println(Arrays.toString(nums));
	//print everything using for each loop
	
	for(int n : nums) {
		if(n >= 17) {
			System.out.println(n);
		}
	
	}
//calculate sum using for loop
	
	int sum = 0;
	for(int i = 0; i < nums.length; i++) {
		sum+= nums[i]; 
		System.out.println("Sum is; " + sum);
		
	}
	int m = nums[nums.length/2];
	int l = nums[nums.length - 1];
	
	System.out.println("m: " + m + "| L: " + l);
	
	//find the lowest and highest number
	int lowest = nums[0];
	for(int x = 0; x < nums.length; x++) {
		if(nums[x] < lowest) {
			lowest = nums[x]; 
			
		}
	}
	
	System.out.println("Lowest number is : " + lowest);
	int max = nums[0];
	for(int y = 0; y < nums.length; y++) {
		if(nums[y] > max) {
			max = nums[y]; 
			
		}
	}
	System.out.println("Max number is: " +max);
}
}
