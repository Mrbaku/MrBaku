package Day50_inheritance03;

public class TestAnimals {

	public static void main(String[] args) {
		
		Animal anm = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		anm.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		System.out.println("############");
		
		anm.move(10);
		cat.move(22);
		dog.move(100);
		duck.move(2);
		
		
		

	}

}
