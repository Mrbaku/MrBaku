package day08_Intro_If_Else;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 230.5;
		int dollars = (int) price;
		double a=5;
	    
	    System.out.println("Price "+ price);
	    System.out.println("Dollars "+dollars);
	    System.out.println(a);
	    System.out.println(""
	            + "");
	    
	    int count=44;
	    byte byteCount=(byte) count;
	    System.out.println("Bytecount: "+byteCount );
	    
	      int result =(int) 500.4/ (int)2.0;
	      
	      System.out.println("result: "+result);
	}

}
