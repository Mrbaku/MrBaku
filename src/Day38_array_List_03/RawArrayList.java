package Day38_array_List_03;
import java.util.*;

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		System.out.println(list);
		String allValues = list.toString();
		System.out.println(allValues);
		
		list.get(0);
		
	}

}
