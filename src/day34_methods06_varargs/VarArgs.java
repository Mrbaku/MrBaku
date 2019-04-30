package day34_methods06_varargs;

import java.util.Arrays;

public class VarArgs {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		printWords("Java", "Love Java");
		System.out.println(sum(3,4,5));
		int budget = 200;
		if(sum(10,45,110,30) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(3,45,453,343,344);
		System.out.println("total: " + total);
		
		cook("Salt", "Peppers", "Oil", "Pasta");
				
	}
	public static void printWords(String...words) {
		for(String w: words) {
			System.out.println(w);
		}
	}
	public static int sum(int...nums) {
		int sum = 0; 
		for(int i: nums) {
			sum +=i;
			
			
		}
		return sum;
	
	}
	public static void cook(String name, String... ings) {
		System.out.println("Food: " + name);
		System.out.println(Arrays.toString(ings));
	}
	
	
	
	
}
