package Day26_Array04;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("Count: " + wordsArray.length);
			System.out.println(Arrays.toString(wordsArray));
			
			String diceResult = "1 - 20 of 1,461 positions";
			String [] wordss = diceResult.split(" ");
			System.out.println(wordss[4]);
			
			String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
			String []  sentence1 = sentence.split("I");
			
			String sentence3 = Arrays.toString(sentence1);
			String [] sentence2 = sentence3.split("happy");
			System.out.println(Arrays.toString(sentence1));
			System.out.println(Arrays.toString(sentence2));
			
			//for(String w: sentence1) {
				//System.out.println(w);
			}
			
	}
//}
