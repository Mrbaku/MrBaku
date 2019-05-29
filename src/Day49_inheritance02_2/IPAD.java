package Day49_inheritance02_2;

import Day49_Inheritance02.Device;

public class IPAD extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book - " + title+ " using " + brand + " ipad");
	}

}
