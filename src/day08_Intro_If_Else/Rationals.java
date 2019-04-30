package day08_Intro_If_Else;

public class Rationals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1=23.61;
        double d2=20.43;
        
        System.out.println(d1>=d2);
        boolean check=d1>=d2;
        
        System.out.println("Check: "+check);
        
        char ch1='a';
        char ch2='j';
        char ch3='A';
        
        System.out.println(ch2>ch1);
        System.out.println(ch1>ch3);
        
        boolean b=true==false;
        System.out.println(b);
        
        boolean b2=true!=false;
        System.out.println(b2);
	}

}
