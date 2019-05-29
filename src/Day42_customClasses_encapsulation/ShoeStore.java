package Day42_customClasses_encapsulation;
import java.util.*;
public class ShoeStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoes shoe = new Shoes();
		shoe.setShoesData("Aldo", 6.5);
		System.out.println(shoe.getShoeData());
		
		Shoes shoe1 = new Shoes();
		shoe1.setShoesData("BOSS", 7.5);
		
		Shoes shoe2 = new Shoes();
		shoe2.setShoesData("Allen Edmons", 9.0);
		
		//converting to array and storing them
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0]= shoe;
		shoesArray[1]= shoe1;
		shoesArray[2]= shoe2;
		
		System.out.println(shoesArray[0].getShoeData());
		System.out.println(shoesArray[1].getShoeData());
		System.out.println(shoesArray[2].getShoeData());
		
		//converting into ArrayList
		ArrayList<Shoes> myShoes = new ArrayList<>();
		myShoes.add(shoe);
		myShoes.add(shoe1);
		myShoes.add(shoe2);
		
		System.out.println(myShoes.get(0).getShoeData());
		System.out.println(myShoes.get(1).getShoeData());
		System.out.println(myShoes.get(2).getShoeData());
		
		//what shoe size is available
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		
		//Stores data into a diff variable
		Shoes redShoes =  myShoes.get(0);
		Shoes redShoes1 =  myShoes.get(1);
		Shoes redShoes2 =  myShoes.get(2);
		
		System.out.println(redShoes.getShoeData());
		System.out.println(redShoes1.getShoeData());
		System.out.println(redShoes2.getShoeData());
		
		//lets use for each loop and print data for each shoe
		//print name of shoes in the list that size is more than 7
		for(Shoes sho  : myShoes) {
			System.out.println(sho.getShoeData());
		}
		for(Shoes sho1: myShoes) {
			if(sho1.size>7.0) {
				System.out.println(sho1.brand);
		}
		
	}


	}
}
