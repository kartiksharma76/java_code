package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	String name, dept;

	Employee(String n, String d) {
		name = n;
		dept = d;
	}

	public String toString() {
		return name;
	}
}

public class GroupemployeeDepartment {
public static void main(String[] args) {
	List<Employee>emp = Arrays.asList(new Employee("Alice","HR"),
            new Employee("Bob","IT"),
            new Employee("Charlie","HR"));
	Map<String, List<Employee>>grouped= emp.stream().collect(Collectors.groupingBy(e->e.dept));
	System.out.println(grouped);
}
}
