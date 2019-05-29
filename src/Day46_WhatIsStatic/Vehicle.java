package Day46_WhatIsStatic;

public class Vehicle {

		String type; // instance variable, every object has its own type
		static int numberOfVehicles; //shared, one central value;
		
		public static void vehicleInfo() {
			//system.out.println("type: " + type) will not comppile. Type is non-static
			System.out.println("NumberOfVehiclesL " + numberOfVehicles);
			int count = getNumberOfVehicles();
			String make = "Kia";
			make = make.toUpperCase();
			System.out.println("Make: " + make);
		}
		public static int getNumberOfVehicles() {
			return getNumberOfVehicles();
		}
		
		public String toString() {
			return "Vehicle type: " + type+ " | count:  "+ numberOfVehicles;
		}
		
}
