package Day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

import java.util.Arrays;
public class StaticImports {
public static void main(String[] args) {
	System.out.println(PI);
	System.out.println(max(10,5));
	System.out.println(min(1000,10001));
	System.out.println(abs(-10));
	System.out.println(round(45.99));
	System.out.println(pow(10,2));
	System.out.println(random());
	
	
	System.out.println(isDigit('1'));
	System.out.println(isAlphabetic('J'));
	
	int [] nums = {23,23,4,3,1,34};
	System.out.println(Arrays.toString(nums));
	
	System.out.println(now());
	
	
}
}
