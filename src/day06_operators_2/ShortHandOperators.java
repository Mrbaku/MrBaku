package day06_operators_2;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int students=45;
        System.out.println("Students "+ students+1);
        
        students=students+5;
        System.out.println("Students "+ students);
        
        students=students-2;
        System.out.println("Students "+ students);
        
        int teachers=10;
        teachers+=2;
        System.out.println("Teachers "+ teachers);
        
        teachers-=5;
        System.out.println("Teachers "+ teachers);
        
        int cars=12; //if you dont wanna use cars=cars*2
        cars*=2;
        System.out.println(cars);
    
        cars+=cars;// <<cars*2
        System.out.println(cars);
        
        
        int shoes=20;
        shoes/=4;
        System.out.println(shoes);
        
        double price=45.50;
        int amount=5;
        price+=amount;
        System.out.println(price);
        
        
        int minutes=66;
        minutes%=60;
        System.out.println("Remaining :"+minutes);
        
        
        int pennies=550;
        pennies%=100;
        System.out.println("Pennies left :"+pennies);
        
        int a=10;
        a=-1;
	}

}
