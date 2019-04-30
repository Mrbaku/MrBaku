package Day24_Arrays_Continued;

public class EachLoop {
public static void main(String[] args) {
	String[] cities = {"Washington D.C.", "Kiev" , "Annandale", "Moscow", "Istanbul" , "Baku", "Miami", "Silver Springs", "Mclean"};
	for(String city: cities) {
		System.out.println(city);
	
	}
	
	System.out.println();
	
	for(String city: cities) {
		if(city.startsWith("M")) {
			System.out.println(city);
		}

}
}
}