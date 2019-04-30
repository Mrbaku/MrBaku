package Day27_Arrays05;

public class CanvasCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://learn.cybertekschool.com/courses/147";
		
		//split by / and store into array
		String [] urlArr = url.split("/");
		System.out.println("Length: " + urlArr.length);
		
		//get last number and convert to int data type
		System.out.println(urlArr[urlArr.length-1]);
		int courseID = Integer.parseInt(urlArr[urlArr.length-1]);
		
		switch(courseID) {
		case 147:
			System.out.println("the course is Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("Qa Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
			default:
				System.out.println("Invalid number for the course");
				break;
			

		
		
		//use switch statement to find course name
		//147 -> Java programming
		//204 -> Mentoring sessions
		//149 -> SDLC
		//152 -> QA Testing
		//144 -> Team activity
		//143 -> Welcome Kit

		}
	}

}
