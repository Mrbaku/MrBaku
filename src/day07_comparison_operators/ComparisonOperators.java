package day07_comparison_operators;

public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(5==5);
        System.out.println(50==5);
        
        int searchCount=5000;
        System.out.println(searchCount==5000);
        
        
        
        int expectedCount=5010;
        System.out.println(searchCount==expectedCount);
        
        
        int speedLimit=55;
        int currentSpeed=75;
        
        System.out.println(speedLimit==currentSpeed);
        
        boolean atLimit=currentSpeed==speedLimit;
        
        System.out.println("At speed limit: "+atLimit);
        
        
        boolean overLimit=currentSpeed>speedLimit;
        
        System.out.println("Over speed limit: " +overLimit);
        
        boolean underlimit= currentSpeed<speedLimit;
        
        
        System.out.println("Under limit: " +underlimit);
        
        
        double balance=150.0;
        boolean broke= balance<=0.0;
        
        System.out.println("Broke?- " +balance);
        
        double transaction= 155.5;
        
        broke=(balance-transaction)<=0;
        
        System.out.println("Will make broke/negative?- " +broke);
	}

}
