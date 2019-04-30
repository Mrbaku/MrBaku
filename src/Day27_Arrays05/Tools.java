package Day27_Arrays05;

public class Tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java --> programming language
		// Selenium --> Test Automation
		// TestNG --> Unit Tests
		// JUnit --> Unit Tests
		// Cucumber --> BDD Style testing
		// Git --> Version control
		// Maven --> Building and execution for project

		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };
		for (int i = 0; i < tools.length; i++) {
			if (tools[i].equals("Java")) {
				System.out.println("Programming Language");
			} else if (tools[i].contentEquals("Selenium")) {
				System.out.println("Test automation");
			} else if (tools[i].equals("TestNG")) {
				System.out.println("Unit test");
			} else if (tools[i].equals("JUnit")) {
				System.out.println("Unit Test");
			} else if (tools[i].equals("Cucumber")) {
				System.out.println("BDD Style testing");
			} else if (tools[i].equals("Git")) {
				System.out.println("Version Control");
			} else if (tools[i].equals("Maven")) {
				System.out.println("Building and execution for project");
			}
		}
		System.out.println("##################");
		for (String tool : tools) {
			switch (tool.toLowerCase()) {
			case "java":
				System.out.println("Java --> programming language");
				break;
			case "selenium":
				System.out.println("Selenium --> Test Automation");
				break;
			case "testng":
			case "junit":
				System.out.println(tool + " --> Testing tool");
				break;
			case "cucumber":
				System.out.println("Cucumber --> BDD Style testing");
				break;
			case "git":
				System.out.println("Git --> Version control");
				break;
			case "maven":
				System.out.println("Maven --> Building and execution for project");
				break;
			default:
				System.out.println("Unknown tool");

			}
		}

	}

}
