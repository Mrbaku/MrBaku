package Day32_Methods_04;

import java.util.Scanner;

public class CallingOtherMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add something
		// mix some seconds
		// fry some minutes
		// boil some minutes

		// 1. method name add
		// -> return: void
		// -> params: 1 String
		// -> print "Add something"
		// add ("oil"); "Add oil"
		// add ("Oil, onions"); "Add oil, onions"

		// 2 mix
		// -> param: 1 int seconds
		// "Mix for 10 seconds"
		makePancakes();
		makePasta();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers");

	}

	public static void cook(String dish, String ing) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ing);
		System.out.println("Cook it untill it is cooked");
		System.out.println("~~" + dish.toUpperCase() + " IS READY~~");
	}

	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		System.out.println("~~DELICIOUS PASTA IS READY ~~");
	}

	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);

	}

	public static void add(String ingridients) {
		System.out.println("Add " + ingridients);
	}

	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}

	public static void fry(int minutes) {
		System.out.println("Mix for " + minutes + " minutes");
	}

	public static void boil(int minutes1) {
		System.out.println("Mix for " + minutes1 + " minutes");

	}
}
