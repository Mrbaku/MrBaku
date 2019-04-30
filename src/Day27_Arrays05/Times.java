package Day27_Arrays05;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare 2 int arrays that can hold hour and minute

		int[] time1 = new int[2];
		int[] time2 = new int[2];

		time1[0] = 10;
		time1[1] = 15;

		time2[0] = 16;
		time2[1] = 10;

		// before comparing, check if both arrays have
		// valid hour/minute

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time 1 had Invalid hour");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time 1 had Invalid minute");
			return;

		}

		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time 2 had Invalid hour");
			return;
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time 2 had Invalid minute");
			return;

		}
	
		//compare arrays and tell which one is earlier
		//compare hours
		if(time1[0] < time2[0]) {
			System.out.println("Time 1 is earlier");
		}else if(time2[0] > time1[0]) {
			System.out.println("Time 2 is earlier");
		}else {
			if(time1[1] < time2[1]) {
				System.out.println("Time 1 is earlier");
			}else if(time2[1] <time1[1]) {
				System.out.println("Time is earlier");
			}else {
				System.out.println("Same time!");
			}
		}
	
	
	
	}

}
