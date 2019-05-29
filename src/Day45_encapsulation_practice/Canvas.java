package Day45_encapsulation_practice;
import java.util.*;
public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course();
		c1.setName("Java Programming");
		
		List<String> teachers = new ArrayList<>();
		teachers.add("Vasyl");
		teachers.add("Muradil");
		teachers.add("Marufjon");
		teachers.add("Muhtar");
		
		c1.setTeachers(teachers);
		
		System.out.println(c1.toString());
		
		List<String> students = new ArrayList<>();
		students.add("Burak");
		students.add("Orhan");
		students.add("Gulnar");
		students.add("Ethem");
		students.add("Sung");
		
		c1.setStudents(students);
		System.out.println(students.toString());
		
		c1.addTeachers("Maria");
		c1.addStudent("Kate");
		
		if(c1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(c1.getStudents().contains("Kate")) {
			System.out.println("Kate is a student");
		}else {
			System.out.println("Kate is not a student");
		}
		
		c1.removeTeachers("Maria");
		c1.removeStudent("Kate");
		
		if(!c1.getTeachers().contains("Maria")) {
			System.out.println("Maria is removed as a teacher successfully");
		}else {
			System.out.println("Maria is still a teacher");
		}
		
		if(!c1.getStudents().contains("Kate")) {
			System.out.println("Kate is removed as a student successfully");
		}else {
			System.out.println("Kate is still a student");
		}
		
	}

}
