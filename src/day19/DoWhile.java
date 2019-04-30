package day19;

public class DoWhile {

	public static void main(String[] args) {
		
		/*int i=1;
		do {System.out.println(i);
			i++;
		}while(i<=10);
		*/
		
		int sum=0;
		int num=1;
		
		do {sum+=num;
		
		num++;}
		while(num<=5);
		System.out.println(sum);
	}

}
 
