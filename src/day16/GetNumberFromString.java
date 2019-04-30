package day16;


public abstract class GetNumberFromString {

	
	public static void main(String[] args) {
		String sentence= "I wrote [236] lines of code";
		
		String codeCount=sentence.substring (sentence.indexOf('[')+1,sentence.indexOf(']'));
		System.out.println("Lines of code: "+codeCount);
		
		//System.out.println("Lines of code: "+sentence.substring (sentence.indexOf('[')+1,sentence.indexOf(']') ));
		
		//Check if code count is more than 20;
		
		int count = Integer.parseInt(codeCount); //converts String value to int if there are only whole numbers!!
		
		if (count>20) {System.out.println("Wrote more than 20 lines of coede today");}

	}

}
