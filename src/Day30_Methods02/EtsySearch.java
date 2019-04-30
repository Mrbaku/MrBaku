package Day30_Methods02;

public class EtsySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navigateEtsy();
		searchForWoodenSpoon();
		printresult();
	}
	public static void navigateEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}
	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden Spoon' into search field");
		System.out.println("Click on 'Search' button");
	}
	public static void printresult() {
		System.out.println("wooden spoon (14, 200)");
	}
}
