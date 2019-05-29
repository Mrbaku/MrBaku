package Day36_WrapperClasses;

public class WrapperClassMethods {
	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		int count = Integer.parseInt("34567");
		System.out.println("count: " + count);
		
		int count2 = Integer.valueOf("34567");
		System.out.println(count2);
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isDigit(9));
		
		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isDigit(str.charAt(6)));
		
		String word = "ab123c5dfer1";
		for(int i = 0; i<word.length(); i++) {
			if(Character.isDigit(word.charAt(i))) {
				System.out.println(word.charAt(i));
			}else if(Character.isAlphabetic(word.charAt(i))) {
				System.out.println(word.charAt(i));
		}
		
	}
	}
}
