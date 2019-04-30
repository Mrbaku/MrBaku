package Day21_Practice_day;

import java.util.Scanner;

public class Practice2_String_Unique {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	/*
	 * 	String word[] = s
	 
		String unique = "";
		
		S ch = word.charAt(0);
		System.out.println((unique.contains(""+ch)));
		if(!unique.contains(""+ ch)) {
			unique += ch;
			
		}
		System.out.println("Unique: " + unique);
	*/
		
		int size = scan.nextInt();
	    String[] words = new String[size];
	    for(int i=0; i < size; i++){
	      words[i] = scan.next();
	    }
	    printUniqueWords(words);
	  }
	  
	  public static void printUniqueWords(String[] words){
	   String [] word = words.split(", ");
	   for(int i=0; i<words.length; i++){
	   if(!words[i].equals(words[i+1])){
	     System.out.println(words[i]);
	   }
	   
	     
	   }
	    
	  }
	}
		
		
