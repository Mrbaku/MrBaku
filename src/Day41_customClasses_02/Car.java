package Day41_customClasses_02;

public class Car {

	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		System.out.println("Car make [" + make+ "], model [" + model+ " ], color is [ " + color+ "], and the current speed is " + currentSpeed+ " mph");
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, following the speed limit -" + speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, over the speed limit -" + speedLimit);
		}
	}
	public void drive() {
		System.out.println(make + " " + model + " is driving");
		
		
		
	}
}