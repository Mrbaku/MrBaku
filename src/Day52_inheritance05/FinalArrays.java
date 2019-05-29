package Day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        final int [] TEAMS = {11,11};
		        System.out.println("Team1: " + TEAMS[0]);
		        System.out.println("Team2: " + TEAMS[1]);

		        TEAMS[0] = 10;
		        TEAMS[1] = 9;

		        System.out.println("Team1: " + TEAMS[0]);
		        System.out.println("Team2: " + TEAMS[1]);

		        final int [] finalNums = {343,3434,322,22};
		        System.out.println(Arrays.toString(finalNums));

		        finalNums[0] = 4545;
		        System.out.println(Arrays.toString(finalNums));

		    final double [] PRICES = new double[3];
		    PRICES[0]= 85.5;
		    PRICES[1] = 99.99;
		    PRICES[2] = 99.98;

		    System.out.println(Arrays.toString(PRICES));

		    PRICES[0] = 69.69;
		        System.out.println(Arrays.toString(PRICES));



		    }

	}


