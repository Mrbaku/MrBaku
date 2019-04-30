package day20_forloop;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "amazon";
		char letter = 't';
		int index = -1;
		//using for loop look for the letter
		//if it is a match assign value to index
		//exit for loop
		//print value of index
		
		for(int a = 0; a < word.length(); a++) {
			if(word.charAt(a) == letter) {
				index = a;
				break;
			}
		}
		System.out.println("Index: " + index);
		
		
	}

}
