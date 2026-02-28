package oopsrealproblem;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;
	private double bonus;

	public FullTimeEmployee(int id, String name, double monthlySalary, double bouns) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary + bonus;
	}

}
