package Day39_arrays_List_04;

import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList);

		List<Double> sumList1 = new ArrayList<>();
		sumList1.add(10.33);
		sumList1.add(10.22);
		sumList1.add(7.34);
		sumList1.add(8.99);
		sumList1.add(8.12);
		sumList1.add(3.55);
		sumList1.add(4.76);
		sumList1.add(8.08);
		sumList(sumList1);
		double sum = sumList(sumList1);
		System.out.println(sum);

		System.out.println(getList(10).toString());
		System.out.println(random(20));

		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("128");
		strNums.add("3");

		convertToIntList(strNums);
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer i : nums) {
			System.out.println(i + " ");
		}
		System.out.println();
	}

	public static double sumList(List<Double> nums1) {
		double sum = 0.0;
		for (Double n : nums1) {
			sum += n;

		}
		return sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			list.add(i);

		}
		return list;
	}

	public static ArrayList<Integer> random(int size) {
		ArrayList<Integer> randomList = new ArrayList<>();
		Random r = new Random(100);
		for (int i = 1; i <= size; i++) {
			randomList.add(r.nextInt(101));

		}
		return randomList;
	}

	public static List<Integer> convertToIntList(List<String> strList) {
		List<Integer> newList = new ArrayList<>();
		for (String str : strList) {
			newList.add(Integer.parseInt(str));
		}
		return newList;
	}

}
