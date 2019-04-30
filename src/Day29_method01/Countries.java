package Day29_method01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = { 
				{ "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstann", "Nursultan" }};

		System.out.println(Arrays.deepToString(countries));
		
		System.out.println(countries[0][0] + " | " + countries[0][1]);
		
		//print all the countries in same line seperated by |
		 String countries2 = "";
         for(int k = 0 ; k<countries.length; k++) {
         	countries2+=countries[k][0]+" ";
         }
         System.out.println(countries2);
         String[] newArrCountries = countries2.split(" ");
         System.out.println(Arrays.toString(newArrCountries));

	
	//get all cities and add to cities [] array
		String[] cities = new String[countries.length];
		System.out.println(Arrays.toString(cities));
		for(int i = 0; i < countries.length; i++) {
			cities [i] = countries [i][1];
		}
	System.out.println(Arrays.toString(cities));
	
	
	System.out.println();
	
	//Look for Bolivia in the countries and test if the caiptal is "LaPaz"
	
	for(int row = 0; row< countries.length; row++) {
		if(countries[row][0].equals("Bolivia")) {
			System.out.println(countries[row][1]);
		}
	}
	
	
	
	}

	
	
	
}
