package day15_String_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		String word1= "github";
		System.out.println(word1.indexOf("g"));//0
		System.out.println(word1.indexOf("th"));//2
		System.out.println(word1.indexOf("g"));//3
		System.out.println(word1.indexOf("j"));//
		
		
		String url= "www.okta.com";
		int index=url.indexOf(".");
		
		System.out.println(url.charAt(index+1));
		
		
		String title="Java - Google Search";
		int dash=title.indexOf("-");
		
		System.out.println(title.charAt(dash-1)); 
		System.out.println(title.charAt(dash+1)); 
		
		String country = "United States of America";
		int states= country.indexOf("States");
		System.out.println("Postion of States: "+states);
		
		
		String word2 = "Java, C++, python, tomcat, eclipse";
		// check C++ is in the word2
		//using contains
		if (word2.contains("C++")) {System.out.println("C++ is there");}else
		{System.out.println("C++ is not there");}
		
		//index method
		
		if(word2.indexOf("C++")>=0) {System.out.println("C++ is there");}else
		{System.out.println("C++ is not there");}
		
		 String sas= "sdlfan;kajdf;afanfkjd";
		 System.out.println(sas.length());
		System.out.println(sas.lastIndexOf("k"));
			
	
	}

}
