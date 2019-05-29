package Day37_arrayList;

import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList();
		list.add("Shoes");
		list.add("Tee-Shirts");
		list.add("Car");
		list.add("Sunglasses");
		list.add("Watches");
		list.add("Jeans");
		int count = list.size();
		System.out.println("Total count: " + count);
		System.out.println(list.toString());
		
		System.out.println(list.get(0) + " | " + list.get(count-1));
		
		list.remove("car");
		System.out.println(list.toString());
		System.out.println("Total count: " + count);
		
		
		for(String item : list) {
			System.out.println(item);
			}
		list.clear();
	System.out.println(list);
	}
}
