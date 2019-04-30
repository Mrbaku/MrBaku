package Day35_Review_Day;

public class EncryptionFunV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		String word = "baku";
		char first = word.charAt(0);
		int position = alphabet.indexOf(first);
		System.out.println("position: " + position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " --> " + enChar);

		String encryptedWord = "";
		for (int i = 0; i < word.length(); i++) {
			char first1 = word.charAt(i);
			int position1 = alphabet.indexOf(first1);
			char enChar1 = encrypted.charAt(position1);
			// System.out.println(first1 + " --> " + enChar1);
			encryptedWord += encrypted.charAt(position1);
		}
		System.out.println(encryptedWord);
	}

}
