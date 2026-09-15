package litcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + salary;

	}
}

public class SortEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Raj", 50000));
		list.add(new Employee(2, "Amit", 70000));
		list.add(new Employee(3, "Zara", 40000));

		list.sort(Comparator.comparingDouble(e -> e.salary));

		System.out.println("Sorted by Salary:");
		for (Employee e : list)
			System.out.println(e);
	}
}
