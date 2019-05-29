package Day38_array_List_03;

import java.util.*;
import java.util.List;

public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");

		// add method with index: "yello will be replaced to index 0
		list.add(0, "yellow");
		System.out.println(list.toString());
		System.out.println("Number of elements: " + list.size());

		// get methods. return value from indez
		System.out.println("3: " + list.get(3));
		System.out.println("0: " + list.get(0));

		// remove using index. removes value from index position
		list.remove(0);
		System.out.println(list.toString());

		// remove using value/element. removes element first occurrence
		list.remove("blue");
		System.out.println(list);

		// set(index, value) replace certain index with new value
		list.set(0, "orange");
		System.out.println(list);

		// index(value). returns index of value in the list
		System.out.println("grey: " + list.indexOf("grey"));

		// isEmpty() returns true if list is empty, size ==0;
		System.out.println("is list empty: " + list.isEmpty());
		System.out.println("is list empty: " + (list.size() == 0));

		// Contains (elem) ==> returns true if value is present
		System.out.println("white in list? - " + list.contains("white"));

		List<String> list2 = new ArrayList<>();

		// ADD-All method ==> adds all values from one list into another
		list2.addAll(list);
		System.out.println(list2);

		// Contains all. check if list has all values of another list
		System.out.println("containsAll: " + list.containsAll(list2));

		// Equals(lists) check if 2 lists are exactly equaLS
		System.out.println("equals: " + list.equals(list2));

		// RemoveALl (list). removes all matching values from your list that are in
		// other list
		list2.removeAll(list);
		System.out.println("list 2 after removal: " + list2);
		System.out.println("list1: " + list);

		// ADD All (index, list) adds a new list values starting from given index
		list2.addAll(00, list);
		System.out.println("list2 after like 2.add(0, list 1): " + list2);

		list.clear();
		list2.clear();

		System.out.println("both empty?: " + (list.isEmpty() && list2.isEmpty()));

	}

}
