package day20_forloop;
import java.util.*;
public class Neighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word:");
		String str = scan.next();
		//aabcdd if character and next one are the same print
		//beep - a
		//beeep -d
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i +1)) {
				System.out.println("Beeep - " + str.charAt(i));
			}
			
		}
		
		
		
	}

}
