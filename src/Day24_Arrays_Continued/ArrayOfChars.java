package Day24_Arrays_Continued;

public class ArrayOfChars {
public static void main(String[] args) {
	char[] values = {'a', 'b', 'c'};
	for(char value: values) {
		System.out.println(value);
	}
	//converts string into char
	//print out letters
	String str = "Wooden spoon";
	char[] chars = str.toCharArray();
	for(char c: chars) {
		System.out.println(c);
		
	}
	//spelling word backwards
	for(int i = chars.length-1; i>=0; i--) {
		System.out.print(chars[i]);
	}
	for(int i = chars.length-1; i>=0; i--) {
		str+= chars[i];
		
}
	System.out.println(str);
	
	
//  Print characters with help of array of characters, one by one 
//  if character is equals to 'o', 
//  replace it with '*' (print it instead of 'o') ;
    for(char c: chars) {
        if(c == 'o') {
            System.out.print("*");
        }else {
            System.out.print(c);
        }
    }
    
}
}

