package encapsulation;

public class Student {
	private int rollNumber = 1;
	private String name = "Amit";
	private int age = 20;

	// we want to interact with external world (Client class)
	// i want to provide read access to the external world? provide only getters
	// method.
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
//i want to provide only write access to the external world? provide only setters method.

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 0)
			return;
		this.age = age;
	}

}
