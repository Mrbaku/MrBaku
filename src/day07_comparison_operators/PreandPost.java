package day07_comparison_operators;

public class PreandPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
	    int num2=++num;
	    System.out.println(num);
	    System.out.println(num2);
	    System.out.println();
	    System.out.println();
	    
	    int bananas=6;
	    int pears=++bananas;
	    int apples=bananas++;
	    System.out.println(bananas);
	    System.out.println(pears);
	    System.out.println(apples);
	    
	    int friends=10;
	    System.out.println(++friends);
	    System.out.println(friends);
	    
	    System.out.println();
	    int p1=10;
	    int sum=p1++ + 5;
	    
	    System.out.println(p1+" "+sum);
	    
	    System.out.println();
	    int batteries=8;
	    int oldBatteries=5;
	    int totalBatteries= batteries++ + ++oldBatteries;
	    
	    System.out.println(batteries);
	    System.out.println(oldBatteries);
	    System.out.println(totalBatteries);

	}

}
