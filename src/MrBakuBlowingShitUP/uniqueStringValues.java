package MrBakuBlowingShitUP;

public class uniqueStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mama";

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			System.out.println(temp);
			for (int j = 0; j < str.length(); j++) {
				if (temp == str.charAt(j) && i != j) {
					System.out.println(temp + " is duplicated");
				}
				int count = 0;
				if(count == 0) {
					System.out.println(temp);
				}
			}
		}
	}

}
