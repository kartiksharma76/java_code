package javapractice2026;

//Encapsulation is data hiding using private variables and public methods to access them.
class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class TestEncaptulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(101);
		s.setName("Kartik");

		System.out.println(s.getId());
		System.out.println(s.getName());
	}
}
