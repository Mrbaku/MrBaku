package Day46_WhatIsStatic;

public class Customer {

	private String name;
	private String email;//instance variables
	
	static int count; //shared by every object 
						//one central copy of this variable

	public Customer() {
		name = "undefined";
		email = "undefined";
		count++;
	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		count++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

}
