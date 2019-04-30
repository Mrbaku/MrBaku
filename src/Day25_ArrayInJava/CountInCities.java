package Day25_ArrayInJava;

public class CountInCities {

	public static void main(String[] args) {
		
		int [] population = new int [5];
		population[0]= 5000;
		population[1]= 10000;
		population[2]= 7000;
		population[3]= 8005;
		population[4]= 8907;
		
		System.out.println(population[0]);
		
		//int [] population = {5000, 10000,7000, 8005, 8907}
		
		int idx = 0; 
		System.out.println("City 0 population: " + population[idx]);
		
		idx++;
		System.out.println("City 1 population: " + population[idx]);
		
		String str = "abc";
		System.out.println("City 0 population: " + population[str.length()]);
		
		String [] cities = {"Miami", "London", "Tokyo", "Baku", "New York"};
		System.out.println("Population of " + cities[0] + " is " + population[0]);
		System.out.println("Population of " + cities[1] + " is " + population[1]);
		System.out.println("Population of " + cities[2] + " is " + population[2]);
		System.out.println("Population of " + cities[3] + " is " + population[3]);
		System.out.println("Population of " + cities[4] + " is " + population[4]);
	}

}
