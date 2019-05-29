package Day36_WrapperClasses;

public class Boxing {
	public static void main(String[] args) {
		//AutoBoxing
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		System.out.println(num2);
		
		//UnBoxing
		double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println(d1);
		System.out.println(d2);
		
		long l1 = new Long(6000000);//unboxing
		Long l2= new Long(23343443L);// no boxing
		long l3 = l2;//auto-unboxing
		Long l4 = l3;//auto-boxing
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		
		Integer num3 = Integer.valueOf(345);
		Double d3 = 
	}

}
