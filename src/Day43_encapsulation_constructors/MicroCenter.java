package Day43_encapsulation_constructors;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer();
		Computer comp1 = new Computer();
		
		System.out.println(comp.toString());
		System.out.println(comp1.toString());
		
		comp.setBrand("iMac");
		comp.setOs("macOs High Sierra");
		comp.setPrice(2600);
		
		comp1.setBrand("Dell XPS");
		comp1.setOs("Windows 10");
		comp1.setPrice(1300);
		System.out.println(comp.toString());
		System.out.println(comp1.toString());
		
		Computer comp2 = new Computer("Apple", "IOS", 2600.0);
		System.out.println(comp2.toString());
		
		comp2.setPrice(comp2.getPrice()-200);
		System.out.println(comp2.toString());
		
		
	}

}
