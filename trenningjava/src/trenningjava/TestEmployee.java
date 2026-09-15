package trenningjava;

public class TestEmployee {

	private static void ShowSalary(Employee e) {

		if (e instanceof Manager) {
			System.out.println("Manager Salary = " + e.getSalary());
		} else if (e instanceof Clerk) {
			System.out.println("Clerk Salary = " + e.getSalary());
		} else {
			System.out.println("Employee Salary = " + e.getSalary());
		}
	}

	public static void main(String[] args) {

		Employee e = new Employee(30000);
		Manager m = new Manager(50000, 10000);
		Clerk c = new Clerk(25000, 5000);

		ShowSalary(e);
		ShowSalary(m);
		ShowSalary(c);
	}
}