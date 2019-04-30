package Day23_Arrays_Started;

import java.util.Scanner;

public class LoopThroughEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 20;
		for(int i=1; i<=num; i++) {
			if(i % 5 == 0) {
				continue;
			}
		if(i %20 == 0) {
			break;
		
		}
		System.out.print(i);
		}
	}

}
