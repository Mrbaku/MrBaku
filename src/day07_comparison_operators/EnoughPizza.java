package day07_comparison_operators;

public class EnoughPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pizzaCount = 50;
		int studentCount= 145;
		boolean isEnoughPizza = (pizzaCount*8/studentCount) > 2;
		System.out.println("Is pizza enough? - " + isEnoughPizza);
	}

}
