package Day42_customClasses_encapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Burger burger1 = new Burger();
		burger1.name= "Cowboy";
		
		String[] ings = {"Onion crisps", "American Cheese", "Pickles", "Lettuce", "B7 Sauce"};
		burger1.ingredients= ings;
		System.out.println(burger1.name);
		System.out.println(Arrays.deepToString(burger1.ingredients));
		
		System.out.println(burger1.ingredients[0]);
		
		//print all ingredients using a loop
		for(String b: burger1.ingredients) {
			System.out.println(b);
		}
	}

}
