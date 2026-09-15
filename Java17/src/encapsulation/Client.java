package encapsulation;

public class Client {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getName());
		student.setAge(-40);
		System.out.println(student.getAge());
		// student.age=-50;
		System.out.println(student.getAge());
	}
}
