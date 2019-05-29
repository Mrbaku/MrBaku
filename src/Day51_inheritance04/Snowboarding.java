package Day51_inheritance04;

public class Snowboarding extends Exercise {
	
	public int perform (int minutes) {
		int cal = super.perform(10);
	System.out.println("SnowBoarding " + minutes + " minutes");
	minutes= (minutes*7)+ cal;
	return minutes;
	}
}
