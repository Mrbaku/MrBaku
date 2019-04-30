package Practice5to7Review;

public class InnerOutterLoop {
	public static void main(String[] args) {
		int [] arr1 = {5,7};
		int [] arr2 = {20,5,22,4,7};
		
		for(int n1:arr1) {
			System.out.println("OUTER: " + n1);
		for(int n2:arr2) {
			System.out.println("INNER: " +n2);
			if(n2==n1) {
				System.out.println("FOUND!!! "+ n1+ " is in Arr2!");
			}
		}
		}
	}
}
