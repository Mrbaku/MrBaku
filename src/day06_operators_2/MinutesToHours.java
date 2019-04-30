package day06_operators_2;

public class MinutesToHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minutes=125;
        int hours=60;
            System.out.println(minutes/hours+" hours "+minutes%hours+ " mintues");
        
        int minute=67;
        int hour=minute/60;
        int remainingMinutes=minute%60;
            System.out.println(hour+" hours "+ remainingMinutes + " minutes");
            
        System.out.println();
	}

}
