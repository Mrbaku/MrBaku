package Practice5to7Review;

public class hotDogStand {
		
	private int ID;
	private int sold;
	//add a static variable "total" that tracks the total number of hot dogs sold by all hot dog stands
	private static int total;
	
	
	
	//Create a constructor that allows a user of the class to initialize both values.
	public hotDogStand(int ID, int sold) {
		this.ID= ID;
		this.sold= sold;
	}
	public int getSold() {
		return this.sold;
	}
	
	//Also create a method named justSold that increments by one of the number of hot dogs the stand has sold
	public void justSold() {
		//sold is for counting sold hot dogs for every hot dog stand individually
	sold++; 
		//total is for counting sold hot dogs for all hot dog stands
	total++;
	}
	
	//static method that returns the value in this variable
	public static int getTotal() {
		return total;
	}
	
	//The idea is that this method will be invoked each time the stand sells a hot dog so that you can track the total
	//number of hot dogs sold
	
}
