package Day40_CustomClasses_Methods;

public class CellPhone {

	String brand;
	double screenSize;
	String color;
	double price;
	
	String name;
	long phoneNumber;
	String email;
	

	public void call() {
		System.out.println("Calling..." + name);
	}

	public void message() {
		System.out.println("Sending txt message...");
	}

	public void takeAPhoto() {
		System.out.println("Taking a photo...");
	}
	
	public void sendMessage() {
		System.out.println("Calling " + phoneNumber);
	}
	
	public void emailing() {
		System.out.println("Emailing " + email);
	}
	
}
