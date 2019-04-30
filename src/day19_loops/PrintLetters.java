package day19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		
				String word = "Amazon";
				             //012345
				             //123456
				//print each character one by one in separate lines
				int idx = 0;
				while(idx < word.length()) {
					System.out.println(word.charAt(idx));
					idx++;
				}
				
			}
		}