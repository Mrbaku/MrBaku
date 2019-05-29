package Day40_CustomClasses_Methods;
import java.util.*;
public class warmUpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Jupiter");
		myList.add("Sun");
		
		String targetWord = "Sun";
		int count = countOccurances(myList, targetWord);
		if(count==3) {
			System.out.println("Unit test Pass: Count is 3.");
		}else {
			System.out.println("Unit test does not Pass");
		}

	}
	public static  int countOccurances(ArrayList <String> list, String word){
		int count = 0;
		for(String str :list) {
			if(str.equals(word)) {
				count++;
			}
		}
		return count;
	}

}
