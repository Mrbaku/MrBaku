package Day50_inheritance03;

public class Duck extends Animal{
	
	public void speak() {
		System.out.println("Duck is QUACKING");
	}
	public void move(int steps) {
		System.out.println("Duck is taking "+ steps+ " steps");
	}
}
