package Day26_Array04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		// find out how many names there are
		System.out.println("Total names: " + names.length);

		// print all names in single line
		System.out.println(Arrays.toString(names));

		// print in column format
		// 2 names in each line
		System.out.println();
		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i] + ", " + names[i + 1]);
		}
		// print all male names
		System.out.println();
		System.out.println("######### MALE NAME#########");
		for (int m = 0; m < names.length; m += 2) {
			System.out.print(names[m] + ", ");
		}

		System.out.println("Females Names:");
		for (int idx = 0; idx < names.length; idx++) {
			if (idx % 2 == 1) {
				System.out.print(names[idx] + ", ");
			}
		}
		System.out.println();
		// print random name from the array
		Random random = new Random();
		int r = random.nextInt(names.length);

		System.out.println("Random name: " + names[r]);

		// print all names that are up to 4 characters , in uppercase in same line
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		for (String p : names) {
			if (p.length() <= 4) {
				System.out.print(p.toUpperCase() + ", ");
			}
		}
		System.out.println();
		System.out.println("\nNAMES LENGTH SORT!!");
		String namesUpTo4 = "";
		String names5to6 = "";
		String names7ormore = "";

		for (String a : names) {
			if (a.length() <= 4) {
				namesUpTo4 += a + ", ";
			} else if (a.length() == 5 || a.length() == 6) {
				names5to6 += a + ", ";
			} else {
				names7ormore += a + ", ";
			}

		}

		System.out.println("Names up to four: " + namesUpTo4);
		System.out.println("Names between 5 and 6: " + names5to6);
		System.out.println("Names more than 7 characters: " + names7ormore);

		
		
		
		// all the names should switch positions
		System.out.println(Arrays.toString(names));
		
		//CODE HERE James, Mary,
		for(int i = 0; i < names.length; i+=2) {
			String temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;	
		}
		System.out.println(Arrays.toString(names));
		
		
		String str1 = "first word";
		String str2 = "second word";
		
		String temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("str1 - " + str1);
		System.out.println("str2 - " + str2);
			
		}

		
	
	}


