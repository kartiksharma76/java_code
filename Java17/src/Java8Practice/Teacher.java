package Java8Practice;

import java.util.List;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	private double salary;
	private boolean isPermanent;

	public Teacher(String name, int age, String subject, double salary, boolean isPermanent) {

		this.name = name;
		this.age = age;
		this.subject = subject;
		this.salary = salary;
		this.isPermanent = isPermanent;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSubject() {
		return subject;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	@Override
	public String toString() {
		return "Teacher{name='" + name + "', age=" + age + ", subject='" + subject + "', salary=" + salary
				+ ", permanent=" + isPermanent + '}';
	}
}
