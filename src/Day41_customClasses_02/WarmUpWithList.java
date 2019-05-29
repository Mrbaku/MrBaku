package Day41_customClasses_02;

import java.util.ArrayList;
import java.util.List;

public class WarmUpWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(4);
		myList.add(10);
		System.out.println(doubleTheList(myList));

	}
	public static List<Integer> doubleTheList(List<Integer> nums) {
		for(int i = 0; i<nums.size(); i++) {
			nums.set(i, nums.get(i) *2);
		}
		return nums;
	}
}
