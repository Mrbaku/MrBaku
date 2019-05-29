package Day50_inheritance03;

public class FullTime extends Employee {

	public void calculatePay(int hours, double rate) {
		double total = (hours*rate) *1.05;
		System.out.println("Full-Time total pay: " + total);
	}
}
