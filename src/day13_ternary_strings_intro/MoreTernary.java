package day13_ternary_strings_intro;

public class MoreTernary {
		public static void main(String[] args) {
			String quality="good";
			
			
			int rating= (quality.equals("good")) ? 100: 0;
		
			System.out.println("Rating: "+rating);
			
			int hour=6;
			
			//Rush hour during evening: 4-7
			
			boolean rushHour;
			rushHour=hour>=4 && hour<=7 ? true : false;
			
			
			//String result= rushHour == ? "yes" : "no"; same below bcause of boolean value
			String result= rushHour ? "yes" : "no";
			System.out.println("Is rush hour? "+result);
			
			
			int AMhour=8;
			
			String amRushHour=AMhour>=6 && AMhour<=9 ? "yes" : "no";
			
			
			
			
			
		}
}
