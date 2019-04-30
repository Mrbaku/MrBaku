package day18;

	public class Letter {
		public static void main(String[] args) {
			
			char letter='Z';
			
			while (letter >='A') {
				System.out.print(letter+" ");
				
				letter--;
			}
			
			
			String letters="";
			char myLetter='A';
			System.out.println();
	
			while(myLetter<='Z') {
				letters=letters+myLetter;
				System.out.println(letters);
			myLetter++;}
}
}
