package Day39_arrays_List_04;

import java.util.*;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");

		for (String city : cities) {
			System.out.print(city + " | ");
		}
		System.out.println();

		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");

		}
		System.out.println();

		// toString. Print each city all uppercase

		System.out.println(cities.toString().toUpperCase());

		// Make each city all uppercase

		String paris = cities.get(0).toUpperCase();
		System.out.println(paris);
		cities.set(0, paris);
		System.out.println(cities);

		cities.set(1, cities.get(1).toUpperCase());

		for (int j = 0; j < cities.size(); j++) {
			String city = cities.get(j).toUpperCase();
			cities.set(j, city);

		}
		System.out.println(cities.toString());

		// find the longest, shortest city
		String longestCity = "";
		String shortestCity = "";

		for (String city : cities) {
			if (city.length() > longestCity.length()) {
				longestCity = city;
			}
		}
		shortestCity = cities.get(0);
		for (String city : cities) {
			if (city.length() < shortestCity.length()) {
				shortestCity = city;

			}
		}
		System.out.println("Longest city: " + longestCity);
		System.out.println("Shortest city: " + shortestCity);
		
		ArrayList <String> citiesMoreThan6 = new ArrayList <>();
		
		for(String city : cities) {
			if(city.length()>6) {
				citiesMoreThan6.add(city);
				
			}
			
		}
		System.out.println(citiesMoreThan6);
	}

}
