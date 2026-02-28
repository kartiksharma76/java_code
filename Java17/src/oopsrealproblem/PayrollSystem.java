package oopsrealproblem;

public class PayrollSystem {
	public static void main(String[] args) {
		Employee emp1 = new FullTimeEmployee(1, "Kartik", 50000, 5000);
		Employee emp2 = new PartTimeEmployee(2, "Riya", 500, 80);
		Employee emp3 = new Intern(3, "Aman", 15000);

		Employee[] employees = { emp1, emp2, emp3 };
		for (Employee emp : employees) {
			emp.displayInfo();
			System.out.println("Salary: " + emp.calculateSalary());
			System.out.println("----------------------");
		}
	}
}
