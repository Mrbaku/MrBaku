package Day33_Methods_05;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * method: getHourlyPay
		 * return type: int
		 * params: int hours, int rate
		 * return total pay by multiplying hours * rate if hours is 0 or negative, return 0;
		 * if rate is 0 or negative, return0
		 */
		int sum = getHourlyPay(8, 70);
		System.out.println("Your pay for the day is: " +sum);
		
		int sum1 = getWeeklyPay(40, 70);
		System.out.println("Your weekly pay is " +sum1);
		
		int sum2 = getMonthlyPay(2800, 4);
		System.out.println("Your monthly pay is: " +sum2);
		
		int sum3 = getYearlyPay(11200, 12);
		System.out.println("Your yearly pay is: " + sum3);
		
		int noPay = getHourlyPay(10, 0);
		System.out.println("No pay: " + noPay);
		
		
		

	}
	public static int getHourlyPay(int hours, int rate) {
	
		if(hours <= 0) {
			System.out.println("Invalid hours");
			return 0;
			}else  if(rate<=0){
				System.out.println("Invalid rate");
				return 0;
			}
		int result = hours*rate;
		return result;
	}
	public static int getWeeklyPay(int hours, int rate) {
		int result = hours*rate;
		return result;
	}
	public static int getMonthlyPay(int hours, int rate) {
		int result = hours*rate;
		return result;
	}
	public static int getYearlyPay(int hours, int rate) {
		int result = hours*rate;
		return result;
	}
}
