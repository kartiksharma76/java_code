package encapsulation;

//Student.java (POJO class)
public class Student1 {
	// Private fields (data hiding)
	private int id;
	private String name;
	private double marks;

	// Constructor
	public Student1(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	// Public getters and setters (controlled access)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id; // validation
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty())
			this.name = name; // validation
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		if (marks >= 0 && marks <= 100)
			this.marks = marks; // validation
	}

}
