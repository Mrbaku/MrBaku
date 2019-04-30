package Day28_Arrays_multiid_arrays;

public class ReversingSentence {

	public static void main(String[] args) {
		//create a string variable sentence and assign value
		//find out and print number of words
		//reverse the sentence and assign to new String called reversed
		//print the reversed
		
		String sentence = "you are very interesting person";
		
		//first split by space then find out the length by using .length
	    String[] a = sentence.split(" ");
	    System.out.println(a.length);
	    
	    
	    String temp = "";
	    for (int i = a.length-1; i >= 0; i --) {
	    	temp += a[i] + " ";

	    }
	    System.out.println(temp);

	}


	}


