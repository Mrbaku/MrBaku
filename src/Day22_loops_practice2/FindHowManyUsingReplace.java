package Day22_loops_practice2;

public class FindHowManyUsingReplace {

	public static void main(String[] args) {
		String word = "including webpages, images";
		
	       int x = 0;
	        while(word.contains("e")){
	          word = word.replaceAll(" ","").replaceFirst("e", "");
	          x++;
	          
	        }
	System.out.println(x);
	System.out.println(word);

	  }
	  
	}