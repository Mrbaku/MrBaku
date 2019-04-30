package Day23_Arrays_Started;

public class SkipNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=20; i++) {
			if(i>4 && i<11) {
				continue;
			}
	System.out.println("Numbers: " + i);
		}
	}

}
