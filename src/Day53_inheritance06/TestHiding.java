package Day53_inheritance06;

public class TestHiding {
	 public static void main(String[] args) {
		City city = new City(345, "London");
		Capital cap = new Capital(333, "Paris");
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		City city1 = new City(12232, "Fairfax");
		Capital cap1 = new Capital(4545, "Baku");
		
		city1.letsBuildARood();
		cap1.letsBuildARood();
		
	}
}
