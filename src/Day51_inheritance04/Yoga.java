package Day51_inheritance04;

public class Yoga extends Exercise{
	public int perform (int minutes) {
	System.out.println("Doing yoga");
	minutes*=10;
	return minutes;
	}	
}
