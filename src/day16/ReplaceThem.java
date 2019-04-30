package day16;

public class ReplaceThem {

	public static void main(String[] args) {
 
		String sentence ="Coding is fun, it is my hobby";
		
		String withNoSpaces =sentence.replace(" ", "");
				System.out.println(withNoSpaces);
				
				sentence=sentence.replace(",", "!!!");
				
				System.out.println(sentence);
				
				
				String mixed="!@#$$%^&&**j@%@%a^%&v)(a)";
				String clean="java";
				
				
				mixed=mixed.replace("!@#$$%^&&**j@%@%a^%&v)(a)", clean);
				System.out.println(mixed);
				
				
				String result="About 115,000,000 results (0.59 seconds)";
				
				result= result.replace("About ", "");
				
				result=result.substring(0,result.indexOf(" "));
				
				System.out.println(result);
				
				String str = "Moscow is a capital of Russia";
				str = str.replace("Moscow", "Baku");
				str = str.replace("Russia", "Azerbaijan");
				System.out.println(str);
		
				String email = "firstName_LastName@gmail.com";
				String comp = "google";
				String newEmail= email.replace("gmail", comp);
				System.out.println(newEmail);
	}

}
