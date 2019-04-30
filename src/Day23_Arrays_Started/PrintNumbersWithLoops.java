package Day23_Arrays_Started;

public class PrintNumbersWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " ");
			}
			System.out.println();
		}
		for (int letters = 1; letters < 3; letters++) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter + ", ");

			}
			System.out.println();
			System.out.println("*****************************************************************************");
		}

	}
}
