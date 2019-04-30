package Day29_method01;

public class Student {

	public static void main(String[] args) {
		study();
		study();
		
		sayHello();
		code();
		code();
	}

	public static void study() {
		System.out.println("Student is styding");
	}
	//create a method with name sayHello that prints "Hello Friends!"
	public static void sayHello() {
		System.out.println("Hello Friends!");
	}
	//create a method with name code "Inside code method" ,"Students is coding Java"
	
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Students is code Java");
	}
}
