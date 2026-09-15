package encapsulation;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("kartik", 19);
		System.out.println("Name:" + person.getName());
		System.out.println("Age:" + person.getAge());

		person.setAge(30);

		System.out.println("updated age:" + person.getAge());
	}
}
