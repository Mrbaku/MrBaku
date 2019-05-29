package Day41_customClasses_02;

public class MyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.make = "BMW";
		car1.model = "3 Series";
		car1.color = "Grey";
		car1.currentSpeed= 55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(90);
		car1.drive();
		
		BMW bmw = new BMW();
		bmw.model= "m3";
		bmw.showPrice();
		System.out.println(bmw.price);
		
		BMW bmw2 = new BMW();
		bmw2.model = "X5M";
		bmw2.showPrice();
		System.out.println(bmw2.price);
		
	}

}
