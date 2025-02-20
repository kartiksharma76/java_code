package StreamAPI;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Employee implements Comparator<Employee> {
	private int id;
	private String name;
	private String company;
	private int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String company, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		List<Employee> data = DataBase.getEmployeeData();
		Comparator<Employee> s = new Employee();
		Collections.sort(data, s);
		for (Employee e : data) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getCompany() + " " + e.getSalary());
		}
		System.out.println();
		System.out.println("*********by using streamAPI**********");
		data.stream().sorted(s).forEach(
				e -> System.out.println(e.getId() + " " + e.getName() + " " + e.getCompany() + " " + e.getSalary()));
	}

	@Override
	public int compare(Employee a1, Employee a2) {
		return Integer.compare(a1.getSalary(), a2.getSalary());

	}
}