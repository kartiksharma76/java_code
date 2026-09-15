package oopsrealproblem;

abstract class Employee {
	protected int id;
	protected String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public abstract double calculateSalary();
	public void displayInfo() {
		System.out.println("ID:"+ id + ",Name: "+ name);
	}
	

}
