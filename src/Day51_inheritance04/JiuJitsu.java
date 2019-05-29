package Day51_inheritance04;

public class JiuJitsu extends Exercise {
	
	public int perform (int minutes) {
	System.out.println("Doing JiuJitsu");
	minutes*=10;
	return minutes;
	}
}
