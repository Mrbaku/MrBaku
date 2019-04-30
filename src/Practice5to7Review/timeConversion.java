package Practice5to7Review;
import java.util.*;
public class timeConversion {

	  public static void main(String[] args) {
	  
	    timeConversion("07:05:45");
	  
	  }
	  
	  public static void timeConversion(String s) {
	  String[] arr = s.split(":");
	    System.out.println(Arrays.toString(arr));
	    
	    if(arr[0].contains("pm")){
	      arr[0] =Integer.toString(Integer.parseInt(arr[0] +12));
	    }
			
			
			 arr[2] = arr[2].replaceAll("\\D", "");
			 
			 for(int i = 0; i<arr.length; i++){
			   System.out.print(arr[i]);
			   if(i != arr.length-1){
			     System.out.print(":");
			   }
			 }
	  System.out.println("");
	  }
	}