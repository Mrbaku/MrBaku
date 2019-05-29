package Day46_WhatIsStatic;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cus1 = new Customer("Abdallah Aleies", "Abdallah@gmail.com");
		Customer cus2 = new Customer("Adilet Kyrgyz", "adilet@yahoo.com");
		Customer cus3 = new Customer("Anastasiia Zasibna", "anastasiia@outlook.com");
		
		System.out.println(cus3.count);
		System.out.println(Customer.count);
		
		Customer cus4 = new Customer("Burak Ucal", "burak@outlook.com");
		System.out.println(Customer.count);
		
		cus1.count=10;
		System.out.println(cus3.count);
		System.out.println(Customer.count);
		
	}

}
