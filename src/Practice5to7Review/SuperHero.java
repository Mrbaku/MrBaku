package Practice5to7Review;

import java.util.Arrays;

public class SuperHero {
	public static void main(String[] args) {
		
		//first way to declare 
		String[] arr1 = {"word"};
		
		//second way of declaring
		String[] arr2 = new String[1];
		arr2[0] = "word";//means the first element of the array is word;
		//we cannot change the size, its fixed, you have to change the declaration
		//to print the array, 
		//System.out.println(Arrays.toString(arr2));
		//arrays can take primitives, arraylist can't
		
		//third way
		String [] arr3 = new String[] {"apple", "kiwi"};
		
		 String[] superheroes = { "Spiderman", "Iron man", "Hulk", 
                 "Wonder Woman", "Thor", "Batman", "Hellboy",
                 "Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };
		 
		//how many superheroes we have with space in their name
		 //lets print all of them, and their count
		 
		 int count = 0;
		 String temp= "";
		 for(String hero: superheroes) {
			 if(hero.contains(" ")) {
				 System.out.println(hero);
				 temp+=hero+ ", ";
				 count++;
				 }
		 }
		 System.out.println("Count of superheroes with space: " + count);
		 System.out.println(temp.substring(0, temp.length()-2));
		 String[] newheroes = temp.split(", ");
		 System.out.println(Arrays.toString(newheroes));
		
		 
		
		
	}
}
