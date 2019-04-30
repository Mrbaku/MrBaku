package day13_ternary_strings_intro;

public class Ternary {

	public static void main(String[] args) {
			String result, quality;
			int score=88;
			
			/*if(score>60){
				result="pass";
			}else {result="fail";}*/
			
			result=score>60 ? "pass" : "fail"	;
			
			//int x=(quality.equals("good")) ? "pass" : "fail";
			// char grade= (score>90) ? 'A' : 'B';
			
			
			
			System.out.println("Result is "+result);
			
	}

}
