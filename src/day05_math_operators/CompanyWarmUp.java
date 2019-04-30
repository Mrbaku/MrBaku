package day05_math_operators;

public class CompanyWarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName="Apple";
	    String address="4860 Bethesda Ave, Bethesda, MD 20814";
	    int numberOfEmployees=1000;
	    String revenue="$150k";
	    boolean isTechCompany=true;
	    char z='"';
	    
	    String aboutCompany= "Company "+companyName+" is located in "+address+"\n"+ numberOfEmployees+ " employees works in there";
	    System.out.println(aboutCompany);
	    System.out.println();
	    System.out.println("Company name is "+ z+companyName+z+"\n"+"address is "+ z+address+z+
	            "\n"+ "Number of employees is "+numberOfEmployees+"\n"+
	    "Annual salary is "+revenue+"\n"+"Is it a tech company? - "+ isTechCompany);
	}

}
