package Day38_array_List_03;

import java.util.*;

public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num1 = new ArrayList<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);

		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20);
		nums2.add(10);
		nums2.add(40);
		nums2.add(30);

		if (num1.containsAll(nums2)) {
			System.out.println("Yes, it contains the same numbers");
		} else {
			System.out.println("No, it doesnt contain the same numbers");
		}

		boolean b = num1.containsAll(nums2) && nums2.containsAll(num1);
		System.out.println(b);

		List<String> planA = new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("ping pong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");

		List<String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("ping pong");
		planB.add("java");
		planB.add("replit");

		if (planB.containsAll(planA) && planA.containsAll(planB)) {
			System.out.println("Plan A and B match");
		} else {
			System.out.println("Plan A and Plan B does not match");
		}

	}

}
