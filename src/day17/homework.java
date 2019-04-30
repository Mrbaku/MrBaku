package day17;

import java.util.Scanner;

public class homework {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String first = word.substring(0,1);
    
    if(first.equalsIgnoreCase("x") || word.substring(word.length()).toUpperCase().equals("X")) {String word2 = word.substring(1, word.length()-1);
      System.out.println(word2);
    }else {
    	System.out.println(word);
    }

    

	}

}
