package Day23_Arrays_Started;

public class CheckNumber {

	public static void main(String[] args) {
	
		for(int i =1; i<=100; i++) {
			if(i==15) {
				break;
		}
	
	System.out.println("Number " + i);
	}
	System.out.println();
	
		for(int x= 1; x<=100; x++) {
		if(x%2>0) {
			continue;
		}
	System.out.println("Number " + x);
	}
		
	
	
	
	}
}
