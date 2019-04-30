package Day21_Practice_day;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();
		String unique = "";
		
		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			
			if(!unique.contains("" + letter)) {
				unique+= letter;
			}
			System.out.println(unique);
		}
	}

}
