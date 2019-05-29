package Day36_WrapperClasses;

import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Azeri");
		languages.add("English");
		languages.add("Russian");
		languages.add("Arabic");
		System.out.println("There are " + languages.size() + " languages");
		languages.add("Turkish");
		System.out.println("There are " + languages.size() + " languages");
		
		languages.remove(4);
	}
}	
