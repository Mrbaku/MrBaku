package Day38_array_List_03;

import java.util.*;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(10);
		numsList.add(1000);
		numsList.add(3);

		System.out.println(numsList);

		System.out.println("Sorting...Please wait...");
		Collections.sort(numsList);
		System.out.println(numsList);

		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhhabbat");
		strList.add("Bojan");

		System.out.println(strList);
		System.out.println("Sorting...Please wait...");
		Collections.sort(strList);
		System.out.println(strList);

		// MAX, MIN
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		System.out.println(maxNum);
		System.out.println(minNum);

		String maxNum1 = Collections.max(strList);
		String minNum1 = Collections.min(strList);
		System.out.println(maxNum1);
		System.out.println(minNum1);

		Collections.shuffle(strList);
		System.out.println(strList);

	}

}
