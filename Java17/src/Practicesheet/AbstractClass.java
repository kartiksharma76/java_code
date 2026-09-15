package Practicesheet;

abstract class Employee1 {
	private String name;
	private int id;

	public Employee1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public abstract double calculateSalary();

	public void displayInfo() {
		System.out.println("ID:" + id + ",Name: " + name);
	}

	public String getName() {
		return name;

	}

	public int getId() {
		return id;
	}
}

class FullTimeEmployee extends Employee1 {

	private double monthlySalary;

	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;

	}

}

class PartTimeEmployee extends Employee1 {
	private double hourlyRate;
	private int hoursWorked;

	public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}

	public class AbstractClass {
//		public static void main(String[] args) {
//			Employee1 emp1 = new FullTimeEmployee("KartikeySharma", 101, 5000.0);
//			Employee1 emp2 = new PartTimeEmployee("Keertan", 102, 20.0, 80);
//
//			emp1.displayInfo();
//			System.out.println("Salary: $" + emp1.calculateSalary());
//
//			emp2.displayInfo();
//			System.out.println("Salary: $" + emp2.calculateSalary());
//		}
	}
}