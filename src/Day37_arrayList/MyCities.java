package Day37_arrayList;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Baku");
		cities.add("Istanbul");
		cities.add("Sterling");
		cities.add("Tashkent");
		
		for(String city : cities) {
			System.out.print(city + ", ");
		}
		System.out.println();
		
		for(int i = 0; i<cities.size(); i++) {
			System.out.print(cities.get(i) + ", ");
			
		}
		cities.remove("Sterling");
		System.out.print("\n" + cities);
		
		System.out.println("Is list empty? " + cities.isEmpty());
		cities.add(0, "Bishkek");
		
		System.out.println(cities.toString());
		
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		cities.set(3, "Seoul");
		System.out.println(cities);
		//find baku and give index
		int idx = cities.indexOf("Baku");
		System.out.println("Index of Baku is: " + idx);
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("Empty: " + empty);
	}

}
