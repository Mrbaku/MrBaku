package Practice5to7Review;

import java.util.Scanner;

public class ControlPanel {

	public static void main(String[] args) {
		//this is our network of hot dog stands
		int cartNumber = 0;
		String command= "";
		hotDogStand [] stands = new hotDogStand[3];
		stands[0] = new hotDogStand(0, 0);
		stands[1] = new hotDogStand(1, 0);
		stands[2] = new hotDogStand(2, 0);
		
		
		
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Enter command:");
			command = scan.next();
		if(command.equals("sold")) {
			System.out.println("Enter Cart number:");
			cartNumber = scan.nextInt();
			stands[cartNumber].justSold();
		}else if(command.equals("print")) {
			System.out.println("Enter Cart number:");
			cartNumber = scan.nextInt();
			System.out.println("Cart sold: " + stands[cartNumber].getSold());
		}else if(command.equals("print-all")) {
			System.out.println("Total sold:" + hotDogStand.getTotal());
		}else {
			return;
		}
		}
		

	}

}
