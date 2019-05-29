package Day43_encapsulation_constructors;

public class TeslaDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tesla tesla = new Tesla();
		tesla.setModel("Model I");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);

		System.out.println("Model: " + tesla.getmModel());
		System.out.println("Range: " + tesla.getRange());
		System.out.println("Zero to 60: " + tesla.getZeroTo60());
		System.out.println("Price: " + tesla.getPrice());
		System.out.println("Is it Self Driving: " + tesla.isSelfDriving());

		System.out.println(tesla);
		System.out.println(tesla.toString());

		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());

		if (tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getmModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		} else {
			System.out.println("Faster model: " + tesla.getmModel());
			System.out.println("0-60 speed: " + tesla.getZeroTo60());
		}
		buy(myTesla);
		buy(tesla);
		System.out.println(testDrive("Model S"));

	}

	public static void buy(Tesla car) {
		System.out.println("Purchasing: " + car.toString());
	}

	public static Tesla testDrive(String model) {
		System.out.println("-Hi, I would like to test drive - " + model);
		System.out.println("-Sure, let me build the object and return it, momentarly");

		Tesla car = new Tesla();
		car.setTeslaInfo(model, 610, 3.9, 125000, false);
		return car;
	}

}
