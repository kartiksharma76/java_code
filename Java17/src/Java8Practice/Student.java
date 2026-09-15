package Java8Practice;

public class Student {
	private int id;
	private String name;
	private int age;
	private double grade;
	private String stream;

	public Student(int id, String name, int age, double grade, String stream) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.stream = stream;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getGrade() {
		return grade;
	}

	public String getStream() {
		return stream;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", grade=" + grade + ", stream='"
				+ stream + '\'' + '}';
	}
}
