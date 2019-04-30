package Practice5to7Review;

public class review {
	public static void main(String[] args) {
		String today = "tuesday";
		String t = today.substring(0, 4);
		String x = today.substring(4);
		System.out.println(t + "\n" + x);
	
		System.out.println(today.substring(2, 3)); // e
		
		System.out.println(today.substring(4, 5));// d
		
		System.out.println(today.charAt(4));// d

		for (int i = 0; i < today.length(); i++) {
			System.out.println(today.charAt(i));// printing words one by one
			System.out.println(today.substring(i, i + 1));// printing each letter twice
		}
		// reversing

		for (int j = today.length() - 1; j >= 0; j--) {
			System.out.print(today.charAt(j) + " ");

		}
		for (int d = today.length() - 1; d >= 0; d--) {
			System.out.print("\n" + today.substring(d, d + 1) + " ");
		}

		String word = "Java is fun";
		String reversed = "";
		for (int y = word.length() - 1; y >= 0; y--) {
			// System.out.print(word.charAt(y));
			//read character and it to reverse
			reversed += word.charAt(y);
		}
		System.out.println(reversed);

	}
}
