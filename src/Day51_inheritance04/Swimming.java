package Day51_inheritance04;

public class Swimming extends Exercise {
	public int perform (int minutes) {
	System.out.println("Swimming");
	minutes*=11;
	return minutes;
	}
	
}
