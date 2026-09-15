package encapsulation;

public class Teacher {
	String name;

	public Teacher(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}

	public static void resetName(Teacher s1) {

		s1.setName("twinkle");

	}

	public static void main(String[] args) {
		Teacher t = new Teacher("prince");
		System.out.println(t.getName());// prince
		resetName(t);
		System.out.println(t.name);// prince
	}
}
