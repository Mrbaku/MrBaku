package Day37_arrayList;

import java.util.ArrayList;

public class RemoveInteger {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<> ();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() ==0);
		
		nums.add(5);
		nums.add(4);
		nums.add(12);
		nums.add(343);
		nums.add(23);
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		
		nums.remove(n1);
		nums.remove(new Integer(4));
		System.out.println(nums.toString());
		
		
	}
}
