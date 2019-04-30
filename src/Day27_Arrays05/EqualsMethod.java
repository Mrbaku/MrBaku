package Day27_Arrays05;

import java.util.Arrays;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 5, 6 };
		int[] arr2 = { 3, 5, 6 };

		Arrays.equals(arr1, arr2);
		System.out.println(Arrays.equals(arr1, arr2));

		int[] arr3 = { 3, 5, 6, 3, 4, 2 };
		int[] arr4 = { 3, 5, 6, 12, 3, 2 };
		Arrays.equals(arr3, arr4);
		System.out.println(Arrays.equals(arr3, arr4));

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("They are exactly the same");
		} else {
			System.out.println("Mismatched values present");
		}

		if (Arrays.equals(arr3, arr4)) {
			System.out.println("They are exactly the same");
		} else {
			System.out.println("Mismatched values present");
		}

		String[] strArr1 = { "one", "two", "three" };
		String[] strArr2 = { "one", "two", "three" };
		boolean match = Arrays.equals(strArr1, strArr2);

		System.out.println(match);

		
		
		
		
		String[] words = {"apples", "oranges", "orange"};
		String[] words1 = {"apples", "apples", "oranges"};
		boolean match1 = Arrays.equals(words,words1);
		System.out.println(match1);
		int x = Integer.M
		
	}

}
