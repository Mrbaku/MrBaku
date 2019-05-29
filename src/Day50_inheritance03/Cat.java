package Day50_inheritance03;

public class Cat extends Animal {
	
	public void speak() {
		System.out.println("CAT is MEOWING");
	}
	public void move(int steps) {
		System.out.println("Cat is taking "+ steps+ " steps");
	}
}
