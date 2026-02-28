package oopsrealproblem;

public class Intern extends Employee {
	private double stipend;

	public Intern(int id, String name, double stipend) {
		super(id, name);
		this.stipend = stipend;
	}

	@Override
	public double calculateSalary() {
		return stipend;
	}

}
