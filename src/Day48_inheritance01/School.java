package Day48_inheritance01;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		Students student = new Students();

		person.name = "Obama";
		person.age = 57;
		person.gender = 'M';

		student.name = "Orhan";
		student.age = 30;
		student.gender = 'm';

		person.eat("steak");
		student.eat("grechka");

		person.walk();
		student.walk();

		person.sleep(8);
		student.sleep(7);

		Students student2 = new Students();
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender = 'm';
		student2.studentID = 4040;
		student2.clazz = "Agile Scrum";

		student2.code("Java");
		student2.attendClass();
		student2.eat("kebab");
		student2.walk();

		student.code("python");
		student.attendClass();

	}

}
