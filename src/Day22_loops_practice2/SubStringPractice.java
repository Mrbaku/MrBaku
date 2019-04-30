package Day22_loops_practice2;

public class SubStringPractice {

	public static void main(String[] args) {

			String word = "Java";
			System.out.println(word.substring(0,1));
			System.out.println(word.substring(1,2));
			System.out.println(word.substring(2,3));
			System.out.println(word.substring(3));
			
			
			int i = 0;
			System.out.println(word.substring(i, i+1));
			i++;
			System.out.println(word.substring(i, i+1));
			i++;
			System.out.println(word.substring(i, i+1));
			i++;
			System.out.println(word.substring(i, i+1));
			
			System.out.println("#######################");
			
			
			for(int n = 0; n <= 3; n++) {
				System.out.println(word.substring(n,n+1));
				
			System.out.println("#########################");
			System.out.println();
			
			System.out.println(word.charAt(word.length()-1));
			System.out.println(word.charAt(word.length()-2));
			System.out.println(word.charAt(word.length()-3));
			System.out.println(word.charAt(word.length()-4));
			System.out.println();
			
			int a=1;
			while(a <= word.length()) {
				System.out.println(word.charAt(word.length()-a));
				a++;
			}
			for( int y = 0; y<=3; y--) {
				String letter = word.substring(n, n+1);
				System.out.println(letter);
			}
			
			
			
			
			}
	}

}
