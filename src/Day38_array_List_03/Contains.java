package Day38_array_List_03;
import java.util.*;
public class Contains {
	public static void main(String[] args) {
		ArrayList <String> list1 = new ArrayList<> ();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1);
		
		ArrayList <String> months = new ArrayList<>(list1);
		System.out.println(months);
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.indexOf("Feb") ==1);
		System.out.println(months.get(1).equals("Feb"));
		
		ArrayList<String> months2 = new ArrayList<> (list1);
		System.out.println("Month: " + months.toString());
		System.out.println("Month2: " + months2.toString());
		
		if(months.containsAll(months2)) {
			System.out.println("Month has the same months as month 2");
		}else {
			System.out.println("Some values are missing");
		}
		months2.add("Jan");
		if(months.containsAll(months2)) {
			System.out.println("Month has the same months as month 2");
		}else {
			System.out.println("Some values are missing");
		}
		
		
		
	}
}
