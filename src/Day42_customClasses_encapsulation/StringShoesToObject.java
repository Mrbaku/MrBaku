package Day42_customClasses_encapsulation;
import java.util.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create shoes object and assign the data from
		//String data
			String data = "Bruno Magli, 9.5";
		//split using, and store into array
			String [] arrData = data.split(",");
		//create Shoe object
			Shoes shoes = new Shoes();
		//converting string to double
			shoes.setShoesData(arrData[0],Double.parseDouble(arrData[1]));
			System.out.println(shoes.getShoeData());
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What shoe brand?");
		String brand = scan.next();
		
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		//create object using data from scanner
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoeData());
		
	}

}
