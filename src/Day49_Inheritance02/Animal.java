package Day49_Inheritance02;

public class Animal {
	
	private String type;
	
	public Animal() {
		System.out.println("Animal Constructing");
		type= "undefined";
		
	}
	public Animal() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
