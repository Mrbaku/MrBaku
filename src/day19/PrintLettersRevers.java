package day19;

public class PrintLettersRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Amazon";
		int idx=word.length()-1;
		
		while(idx<word.length()&& idx>=0) {
			
			char character=word.charAt(idx);
		
		System.out.println(word.charAt(idx));
		idx--;}

	}

}
