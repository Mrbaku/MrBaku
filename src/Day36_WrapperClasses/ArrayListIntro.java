package Day36_WrapperClasses;

import java.util.ArrayList;
public class ArrayListIntro {
	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList<>(); 
		ArrayList <Integer> nums = new ArrayList<>();  
		
		//assign values into arrayList
		
		names.add("Orhan");
		names.add("Roman");
		names.add("Vlad");
		
		nums.add(1);
		nums.add(343);
		nums.add(3434);
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(nums.get(0));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Numbers count: " + nums.size());
		
		
		}
}
