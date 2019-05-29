package Day50_inheritance03;

public class Dog extends Animal {
	
	public void speak() {
		System.out.println("Dog is BARKING");
	}
	public void move(int steps) {
		System.out.println("Dog is taking "+ steps+ " steps");
	}
}
