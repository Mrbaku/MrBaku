package day15_String_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("lipse"));
		System.out.println(word1.startsWith("EC"));
		System.out.println(word1.toUpperCase().startsWith("EC"));
		System.out.println();
		
		boolean hase=word1.contains("z");
		System.out.println(hase);
		
	}

}
