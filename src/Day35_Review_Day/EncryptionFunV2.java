package Day35_Review_Day;

import java.util.Arrays;

public class EncryptionFunV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		System.out.println(encryptSentence("java is fun"));
		

	}
	public static char encryptChar(char ch) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	return encrypted.charAt(alphabet.indexOf(ch));

	}
	public static String encryptWord(String word) {
		String cyphered = "";
		for(int i = 0; i<word.length(); i++) {
			cyphered+= encryptChar(word.charAt(i));
		}
		return cyphered;
	}
	public static String encryptSentence(String sentence) {
		String [] arr = sentence.split(" ");
		String retValue = "";
		for(String str: arr) {
			retValue+=encryptWord(str);
		}
		return retValue.trim();
	
		
	}
}
