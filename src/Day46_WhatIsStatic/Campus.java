package Day46_WhatIsStatic;

public class Campus {

	private	String city;
		
		static {
			System.out.println("Static Block");
		}
		
		public Campus(String city) {
			System.out.println("Constructor...");
			this.city = city;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		
}
