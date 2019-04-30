package Practice5to7Review;

import java.util.Scanner;

public class MiddleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Javaclass";
		//print middle char
		System.out.println("Middle one: " + word.charAt(word.length()/2));
		
		word = "javadays";
		
		String middle2 = word.charAt(word.length()/2-1) +""+
							word.charAt(word.length()/2);
		System.out.println("Middle 2: " + middle2);
		
		String middle3 = word.substring(3,5);
		System.out.println("Midde letter: " + middle3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word, i will give you middle (s)");
		String str = scan.next();
		String m= "";
		
		if(str.length() % 2 == 0) { //even count of chars
			m = str.substring(str.length()/2-1, str.length()/2+1);
		}else {
			m = str.substring(str.length()/2, str.length()/2+1);			
		}
		
		System.out.println("M:" + m);
		
		
		
		
		
	}
}

