package Day40_CustomClasses_Methods;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.price);

		cell1.brand = "Nokia 6300";
		cell1.color = "Silver";
		cell1.screenSize = 2.0;
		cell1.price = 76.16;

		System.out.println("Brand: " + cell1.brand);
		System.out.println("screenSize: " + cell1.screenSize);
		System.out.println("Color: " + cell1.color);
		System.out.println("Size: " + cell1.price);

		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		System.out.println();
		System.out.println("##### CELL 2 VALUES #####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("screenSize: " + cell2.screenSize);
		System.out.println("Color: " + cell2.color);
		System.out.println("Size: " + cell2.price);

		System.out.println();
		System.out.println("##### CALLING METHODS ####");
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		
		
		System.out.println();
		CellPhone contacts = new CellPhone();
		
		contacts.name = "Orhan's Contacts";
		contacts.phoneNumber= 3453452333L;
		contacts.email = "sultan-ov@hotmail.com";
		
		System.out.println("Name: " + contacts.name);
		System.out.println("phoneNumber is: " + contacts.phoneNumber);
		System.out.println("Email is: " + contacts.email);
		
		contacts.call();
		contacts.sendMessage();
		contacts.emailing();
		
		
				

	}

}
