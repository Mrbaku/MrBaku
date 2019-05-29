package Day40_CustomClasses_Methods;

public class Company {

	
		// TODO Auto-generated method stub

		String name;
		String jobTitle;
		double salary;
		
		public void work() {
			System.out.println("Working as " + jobTitle);
		}
		
		public void attednMeeting() {
			System.out.println(name + " is attending meeting ");
			
			
		}
		
		public void introduce() {
			System.out.println("Name[" + name + "], job title is [" + jobTitle + "], salary is " + salary + "]");
		}
		
		
	
	

}
