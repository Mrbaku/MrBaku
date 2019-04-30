package Day24_Arrays_Continued;

public class CitiesUsingArrays {
	public static void main(String[] args) {
		
		//create an array that stores cities names;
		//print cities that starts with M;
		
		String[] cities = {"Washington D.C.", "Kiev" , "Annandale", "Moscow", "Istanbul" , "Baku", "Miami", "Silver Springs", "Mclean"};
		int numbers[] = new int[9];
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
	}
}
