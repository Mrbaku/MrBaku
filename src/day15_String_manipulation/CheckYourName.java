package day15_String_manipulation;

public class CheckYourName {

	public static void main(String[] args) {
		
		String name="Fuad";
		
		System.out.println(name.contains("a")+" "+name.contains("e"));
		
		if(name.contains("a") || name.contains("b")) {
			System.out.println("'a' or 'e' is present");
		}else {System.out.println("'a' or 'e' is missing");}
			
	}

}
