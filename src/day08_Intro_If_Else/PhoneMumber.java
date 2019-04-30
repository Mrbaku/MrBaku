package day08_Intro_If_Else;

import java.util.Scanner;

public class PhoneMumber {
public static void main(String[] args) {
    
Scanner scan=new Scanner (System.in);
 int areaCode, localNumber;

 System.out.println("Enter your area code:");
 areaCode=scan.nextInt();

 System.out.println("Eter local number");
 localNumber=scan.nextInt();


 String phoneNumber="-"+"("+ areaCode+")-"+localNumber;
 System.out.println(phoneNumber);

 System.out.println("Calling number "+ phoneNumber);

 int result =(int) 500.4/ (int)2.0;

 System.out.println("result: "+result);
	}

}
