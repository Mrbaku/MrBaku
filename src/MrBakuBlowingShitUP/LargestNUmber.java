package MrBakuBlowingShitUP;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++){
	      for(int j=0 ;j<=cols-1;j++){
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    int max = 0;
	    for(int i = 0; i<rows; i++){
	      for(int j= 0; j<cols; j++){
	        if(arr[i][j]>max){
	          max = arr[i][j];
	        }
	      }
	    }
	    for(int x = 0; x<rows; x++){
	      for(int y = 0; y<cols; y++){
	        arr[y][x]= max;
	      }
	    }
	    
	    System.out.println(Arrays.deepToString(arr));
	    
	   
	  }
	}