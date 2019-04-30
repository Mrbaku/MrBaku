package day18;

public class Loop2 {
public static void main(String[] args) throws InterruptedException {
	int num=12;
	while (num>=1) {
		System.out.print(num+ ", ");
		
		num--;
		 Thread.sleep(500);
	}
	
}
}
