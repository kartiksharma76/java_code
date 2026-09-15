package encapsulation;

public class Employee {
	String name;

	public Employee(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}

	public static void swap(Employee s1, Employee s2) {

		Employee temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println(s1.name + " " + s2.name);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("prince");
		Employee e2 = new Employee("kartik");
		System.out.println(e1.getName() + " " + e2.getName());// prince kartik

		swap(e1, e2);
		System.out.println(e1.getName() + " " + e2.getName());// kartik prince

	}
}
