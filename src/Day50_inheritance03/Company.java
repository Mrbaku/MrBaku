package Day50_inheritance03;

public class Company {
public static void main(String[] args) {
	Employee emp = new Employee();
	FullTime ft = new FullTime();
	Contractor ct = new Contractor();
	
	emp.calculatePay(40, 60);
	ft.calculatePay(40, 55);
	ct.calculatePay(40, 65);
	
}
}
