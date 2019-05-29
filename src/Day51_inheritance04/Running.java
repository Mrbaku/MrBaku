package Day51_inheritance04;

public class Running extends Exercise {
	@Override
	public int perform (int minutes) {
		System.out.println("Running");
		minutes*=10;
		return minutes;
		}
		
}
