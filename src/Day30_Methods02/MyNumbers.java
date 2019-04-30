package Day30_Methods02;

import java.util.Random;

public class MyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		showMe5Numbers();
		showMe5Numbers();
	}
	public static void showMe5Numbers() {
		Random random = new Random();
		for(int x = 0; x< 5; x++) {
			int value = random.nextInt(1000);
			System.out.print(value + " " );
		}
	System.out.println();
	}
}
