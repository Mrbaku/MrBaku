package Day42_customClasses_encapsulation;
import java.util.*;
public class Starbucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an array that can store 2 coffee objects
		//int [] nums = new int [2]
		//declare coffeearray that can store 2 coffee objects
		
		Coffee [] coffeeArray = new Coffee[2];
		//creating coffee objects and assigning to index 0
		coffeeArray[0] = new Coffee();
		//access coffee object in index 0 and set data
		coffeeArray[0].setCoffeeInfo("Espresso", "Tall", 2.55, 7);
		//access coffee object in index 0 and call method getCoffeeInfo
		coffeeArray[0].getCoffeeInfo();
		//create a single object first
		
		Coffee latte = new Coffee();
		//create a single object first
		latte.setCoffeeInfo("Coffee Latte", "Grande", 3.85, 190);
		//assign the latee object to index 1 of the array
		coffeeArray[1] = latte;
		//then assign coffeearay to latte
		coffeeArray[1].getCoffeeInfo();
		//print data by using the method
	}

}
