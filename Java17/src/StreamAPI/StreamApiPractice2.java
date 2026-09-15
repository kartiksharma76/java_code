package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//sort employee by their salary if salary matches then sort by names
// using Comparator technique and streamAPI
//Q2.fetch all employee names
//Q3.fetch distinct companies name
//Q4.fetch the employee who has highest salary
//Q5.fetch all those employes working for tcs
public class StreamApiPractice2 {
	public static void main(String[] args) {
		System.out.println("******");
		List<Employee> list = DataBase.getEmployeeData();
		// Q2.fetch all employee names
		list.stream().map(t -> t.getName()).collect(Collectors.toList()).forEach(System.out::println);
		// Q3.fetch distinct companies name
		Function<Student, String> fun = f -> f.getBranch();
		System.out.println("**********");
		list.stream().map(t -> t.getCompany()).distinct().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**************");
		
		// Q4.fetch the employee who has highest salary
	Comparator<Employee> sortBySalary= (e1,e2)->e2.getSalary()-e1.getSalary();
//		Employee employee = list.stream().sorted(sortBySalary).findFirst().get();
//		System.out.println(employee.getId()+" "+employee.getName()+" "+ employee.getCompany()+" "+employee.getSalary());
	
		// Q5.fetch all those employes working for tcs
		System.out.println("************");
		list.stream().filter(e -> "TCS".equalsIgnoreCase(e.getCompany())).sorted(sortBySalary)
				.collect(Collectors.toList()).forEach(e -> System.out
						.println(e.getId() + " " + e.getName() + " " + e.getCompany() + " " + e.getSalary()));
		
		System.out.println("*******************");
		Optional<Employee>max=list.stream().max((e1,e2)->e2.getSalary()-e1.getSalary());
		Employee employee=max.get();
	//	System.out.println(employee.getId()+" "+employee.getName()+" "+ employee.getCompany()+" "+employee.getSalary());
		Comparator<Integer> sort=(s1,s2)->s2-s1;
		
		
	    Integer maxSalary = list.stream().map(Employee::getSalary).max((s1,s2)->s1-s2).get();
		System.out.println(maxSalary);
		
		System.out.println("fetch the employee who has second highest salary");
		Employee employee2 = list.stream().sorted(sortBySalary).collect(Collectors.toList()).get(1);
		System.out.println(employee2.getId()+" "+employee2.getName()+" "+ employee2.getCompany()+" "+employee2.getSalary());
	}
}
