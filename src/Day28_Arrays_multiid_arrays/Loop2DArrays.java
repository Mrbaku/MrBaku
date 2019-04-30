package Day28_Arrays_multiid_arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		String[][] pizzas = {{"pineapple", "pepperoni"},
				            {"anchovies",  "mushrooms", "olives"},
				            {"4 cheese"},
				            {"chicken", "tomatoes", "jalapones", "onions"},
				            {"green peppers", "zuccini", "brocolli", "spinach", "shrimp"}};
		
		for(String [] pizza :pizzas) {
			System.out.print("How many topics: " + pizza.length);
			System.out.println(Arrays.toString(pizza));
		}
		
		for(int i = 0; i< pizzas.length; i++) {
			System.out.print("How many topics: " + pizzas[i].length);
			System.out.println(Arrays.toString(pizzas[i]));
		}
	
	
	int [][] students = {{4,5,6}, {12,5,7}, {23,44,55,55,3}};
	
	for(int [] group :students) {
		for(int studentID : group) {
			System.out.print(studentID + ", ");
		}
		System.out.println();
	}
		int [][] nums = {
				        {10, 20},
				        {20, 30, 40, 50},
				        {100, 200, 400},
				        {555, 333, 111, 444, 666, 78}
		                };
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
		}
		
		}
	
	
	}


