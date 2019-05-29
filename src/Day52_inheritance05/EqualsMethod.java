package Day52_inheritance05;

public class EqualsMethod {
	 
	public static void main(String[] args) {
		Computer comp = new Computer("IMac", "space grey");
		Computer comp1 = new Computer("IMac", "space grey");
		Computer comp2 = comp1;
		
		System.out.println(comp==comp1);
		System.out.println(comp1.equals(comp2));
		
		System.out.println(comp2==comp1);
		System.out.println(comp2.equals(comp1));
		
		
	}
}
