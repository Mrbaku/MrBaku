package Day28_Arrays_multiid_arrays;

import java.util.Arrays;

public class FootBallTeams {
	public static void main(String[] args) {

		String[][] teams = new String[2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";

		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";

		System.out.println("First player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][1]);
		System.out.println(teams[0][2]);
		System.out.println(teams[0][3]);
		System.out.println(teams[0][4]);
		System.out.println(teams[0][5]);

		System.out.println("First player of second team");
		System.out.println(teams[1][0]);
		System.out.println(teams[1][1]);
		System.out.println(teams[1][2]);
		System.out.println(teams[1][3]);
		System.out.println(teams[1][4]);

		System.out.println("Number of rows: " + teams.length);
		System.out.println("People of in first team: " + teams[0].length);
		System.out.println("People of in second team: " + teams[1].length);

		System.out.println(Arrays.deepToString(teams));

		System.out.println();

		System.out.println("###################################");

		int[][] city = new int[3][4];
		city[0][0] = 100;
		city[0][1] = 500;
		city[0][2] = 1234;
		city[0][3] = 5434;

		city[1][0] = 555543;
		city[1][1] = 3232323;
		city[1][2] = 32322;
		city[1][3] = 54233234;

		city[2][0] = 555543;
		city[2][1] = 323232;
		city[2][2] = 32322;
		city[2][3] = 54233234;

		System.out.println("NUMBER OF CITIES: " + city.length);
		System.out.println("AMOUNT OF PEOPLE IN THE FIRST CITY: " + city[0].length);
		System.out.println("AMOUNT OF POEPLE IN THE SECOND CITY " + city[1].length);
		System.out.println("AMOUNT OF PEOPLE IN THE THIRD CITY: " + city[2].length);

		System.out.println(Arrays.deepToString(city));
		System.out.println(Arrays.toString(city[1]));

		System.out.println();
		System.out.println("##########################################");
		
		
		int[][] scores = { { 3, 5, 10 }, { 6, 4, 3, 10 } };
		System.out.println("DAYS PLAYED/NUMBERS OF ARRAYS: " + scores.length);
		System.out.println("NUMBER OF VALUES IN 1: " + scores[0].length);
		System.out.println("NUMBER OF VALUES IN 2: " + scores[1].length);
		
		
		System.out.println();
		System.out.println("##########################################");
		
		int [][] values = new int[4][];
		values[0] = new int[] {34,23,5};
		values[1] = new int[] {34,342,43,23,2,2343,332};
		values[2] = new int[2];
		values[2][0]= 55;
		values[2][1] = 34;
		values[3] = new int[] {23,23,34,43,2};
		
		System.out.println("NUMBER OF VALUES INSIDE THE ARRAY " + values.length);
		System.out.println("NUMBER OF VALUES IN 0: " + values[0].length);
		System.out.println("NUMBER OF VALUES IN 1: " + values[1].length);
		System.out.println("NUMBER OF VALUES IN 2: " + values[2].length);
		System.out.println("NUMBER OF VALUES IN 3: " + values[3].length);
		
		System.out.println(Arrays.deepToString(values));
		
	}
}
