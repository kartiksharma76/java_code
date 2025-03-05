package Java8Practice;

/**
 * Retrieve Employee Names and Birth Dates – Print the names and birth dates of all employees      //solved.
Filter Employees by Department – Print names and birth dates of employees in the "IT" department.  //solved
Find Duplicate Names – Check for duplicate employee names and print them.                          //solved
Count Employees by Marital Status – Count and display the number of "Single" and "Married" employees.//solved
Find Employees Who Joined Before 2010 – List employees who joined before the year 2010.              //solved

Print name and birthday of employee whose birth date is 15 july 1998   //solved
Give name and I'd of employee who are married                          //solved
List out name of female employees born before 2000                //solved
Associate name of male employee with their job title              //solved
Give count of total no of employee                                //solved

Find the Highest Paid Employee – Print the details of the employee with the highest salary.//solved
Find Employees with the Same Birth Date – Identify employees who share a birth date.//solved
Group Employees by Department – Count and display employees in each department.//solved
Sort Employees by Salary – Display employees sorted by salary in descending order.//solved
Find the Youngest and Oldest Employee – Identify the youngest and oldest employees.//solved

Calculate Average Salary by Department – Print the average salary of each department.//solved
Filter Employees by City – Print employees working in Bangalore.//solved
Find Employees with Over 10 Years of Experience – List employees who have been with the company for over 10 years.
//Find Employees by Role – Print details of all "Java Developers.//solved
Top 3 Highest Paid Employees – Print the top three highest-paid employees.
Salary Breakdown by Marital Status – Calculate total salary paid to "Single" and "Married" employees.////solved

Data Validation and Error Handling Questions Validate if there are any duplicate employee IDs in the list.
.male Employees earning more than 30,00,000: 
single Employees working in Marketing
 How many employees are earning more than ₹50,00,000?
 name and salary employees are earning more than ₹50,00,000?
 
 .How many employees are earning less than ₹10,00,000?
 How many employees are above 30 years old?
 How many employees are below 25 years old?
 Who are the employees born before 1990?
 .Who are the employees born in the 2000s?
 
 What is the total salary paid to HR employees?
  What is the total salary paid to Finance employees?
  .Which department has the highest total salary payout?
 */
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProblemPractice {
	public static void main(String[] args) {
		List<Employee> employees = DataBase.getEmployees();

// 1. Retrieve Employee Details
		Map<String, LocalDate> nameToBirthdayMap = employees.stream().collect(
				Collectors.toMap(Employee::getName, Employee::getBornDate, (existing, replacement) -> existing));

		System.out.println("Employee Name and Birthday:");
		nameToBirthdayMap.forEach((name, dob) -> System.out.println(name + " - " + dob));

// 2. Filter by Department (Only IT employees)
		Map<String, LocalDate> itEmployees = employees.stream().filter(emp -> "IT".equals(emp.getDepartment())).collect(
				Collectors.toMap(Employee::getName, Employee::getBornDate, (existing, replacement) -> existing));

		System.out.println("\nIT Department Employees - Name and Birthday:");
		itEmployees.forEach((name, dob) -> System.out.println(name + " - " + dob));

// 3. Check for Duplicate Names
		Set<String> allNames = new HashSet<>();
		Set<String> duplicateNames = employees.stream().map(Employee::getName).filter(name -> !allNames.add(name))
				.collect(Collectors.toSet());
		System.out.println("\nDuplicate Employee Names:");
		if (duplicateNames.isEmpty()) {
			System.out.println("No duplicate names found.");
		} else {
			duplicateNames.forEach(System.out::println);
		}

// 4. Count Employees by Marital Status
//		public static <T, K, A, D>
//	    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
//	                                          Collector<? super T, A, D> downstream) {
//		

		Map<String, Long> maritalStatusCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getMaritalStatus, Collectors.counting()));
		System.out.println("\nEmployee Count by Marital Status:");
		maritalStatusCount.forEach((status, count) -> System.out.println(status + ": " + count));

// 5. Find Employees Who Joined Before 2010
		System.out.println("\nEmployees who joined before 2010:");
		employees.stream().filter(emp -> emp.getHireDate() != null && emp.getHireDate().getYear() < 2010)
				.map(Employee::getName).forEach(System.out::println);

//6.(twinkle didi): list out name out of female employee born before 2000
		System.out.println(" name of femele Employee who joined 2000");
		employees.stream().filter(emp -> emp.getHireDate() != null && emp.getHireDate().getYear() == 2000)
				.filter(emp -> "female".equalsIgnoreCase(emp.getSex())).map(Employee::getName)
				.forEach(System.out::println);

//7.(twinkle didi): give the name and id of a martial employee
		System.out.println("\ngive the name and id of a martial employee:");
		employees.stream().filter(emp -> "married".equalsIgnoreCase(emp.getMaritalStatus()))
				.forEach(emp -> System.out.println("Id:" + emp.getEid() + ":name:" + emp.getName()));

//8.(twinkle didi) :give account of total no of employee
		System.out.println("\ngive account of total no of employee:");
		long totalEmployee = employees.stream().count();
		System.out.println(totalEmployee);

//9. (twinkle didi) :accociate name or male employee with their job title
		System.out.println("\naccociate name or male employee with their job title:");
		employees.stream().filter(emp -> "Male".equalsIgnoreCase(emp.getSex()))
				.forEach(emp -> System.out.println("jobtitle:" + emp.getJobTitle() + ":name:" + emp.getName()));
		List<Employee> collect = employees.stream().filter(emp -> "Male".equalsIgnoreCase(emp.getSex()))
				.collect(Collectors.toList());
		System.out.println("************");
		// collect.forEach(emp -> System.out.println( emp.getJobTitle() + " " +
		// emp.getName()));
		// public static <T, K, U>
		// Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
		// Function<? super T, ? extends U> valueMapper) {
		// R apply(T t);
		// public interface Function<T, R> {

//		 public static <T, K, U>
//		    Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
//		                                    Function<? super T, ? extends U> valueMapper,
//		                                    BinaryOperator<U> mergeFunction) 
		// R apply(T t, U u);
		// public interface BiFunction<T, U, R>
		// public interface BinaryOperator<T> extends BiFunction<T,T,T>
		Function<Employee, String> keyMapper = (e) -> e.getName();
		Function<Employee, String> valueMapper = (e) -> e.getJobTitle();
		BinaryOperator<String> mergeFunction = (t, u) -> t + "," + u;
		Map<String, String> collect2 = employees.stream().filter(emp -> "Male".equalsIgnoreCase(emp.getSex()))
				.collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction));
		Map<String, String> collect3 = employees.stream().filter(emp -> "Male".equalsIgnoreCase(emp.getSex()))
				.collect(Collectors.toMap((e) -> e.getName(), (e) -> e.getJobTitle(), (t, u) -> t + "," + u));
		Map<String, String> collect4 = employees.stream().filter(emp -> "Male".equalsIgnoreCase(emp.getSex()))
				.collect(Collectors.toMap(Employee::getName, Employee::getJobTitle, (t1, t2) -> t1 + "," + t2));
		System.out.println(collect4);
//10.(twinkle didi) :print name and birth employee who has join of 15july1998
		System.out.println("\nprint name and birth employee of 15july1998");
		employees.stream().filter(emp -> emp.getBornDate().equals(LocalDate.of(1998, Month.JULY, 15)))
				.forEach(emp -> System.out.println("name:" + emp.getName() + ":Birthday:" + emp.getBornDate()));

//11.employee with shared multiple birthdate
		System.out.println("\nBirthdates shared by multiple employees:");
		Set<LocalDate> duplicateBirthdates = new HashSet<>();
		Set<LocalDate> seenBirthdates = new HashSet<>();
		for (Employee emp : employees) {
			if (!seenBirthdates.add(emp.getBornDate())) {
				duplicateBirthdates.add(emp.getBornDate());
			}
		}
		duplicateBirthdates.forEach(System.out::println);

//12. same birth date
		System.out.println("\nsame birth date:");
		employees.stream().collect(Collectors.groupingBy(Employee::getBornDate)).values().stream()
				.filter(list -> list.size() > 1).forEach(list -> {
					System.out.println("Employees born on " + list.get(0).getBornDate() + ":");
					list.forEach(emp -> System.out.println(" - " + emp.getName()));
				});

//13. sorting salary by descending 
		System.out.println("\nEmployees sorted by salary;	");
		employees.stream().sorted(Comparator.comparing(Employee::getCtc).reversed())
				.forEach(emp -> System.out.println(emp.getName() + "-" + emp.getCtc()));

//14.employee highest salary
		System.out.println("\nemployee highest salary:");
		employees.stream().max(Comparator.comparing(Employee::getCtc))
				.ifPresent(emp -> System.out.println(emp.getName() + "-" + emp.getCtc()));

//15.youngest employees
		System.out.println("\noldest employee::");
		employees.stream().min(Comparator.comparing(Employee::getBornDate))
				.ifPresent(emp -> System.out.println(emp.getName() + " " + emp.getBornDate()));

//16.oldest employees
		System.out.println("\nyoungest employee:");
		employees.stream().max(Comparator.comparing(Employee::getBornDate))
				.ifPresent(emp -> System.out.println(emp.getName() + " " + emp.getBornDate()));

//17.average salary of department
		System.out.println("\naverage salary of department:");
		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getCtc)))
				.forEach((dept, avgSalary) -> System.out.println(dept + ": " + avgSalary));

//18. employee in bangalore
		System.out.println("\nemployee in bangalore:");
		employees.stream().filter(emp -> "Bangalore".equals(emp.getWorkLocation()))
				.forEach(emp -> System.out.println(emp.getName()));

//19. employee with specific java developer
		System.out.println("\njava developer:");
		employees.stream().filter(emp -> "Java Developer".equals(emp.getJobTitle()))
				.forEach(emp -> System.out.println(emp.getName()));
//20 Find employees who have been with the company for more than 5 years.
		List<Employee> employee = DataBase.getEmployees();
		LocalDate fiveyearAgo = LocalDate.now().minusYears(5);
		System.out.println("\nEmployees who have been with the company for more than 5 years:");
		employee.stream().filter(emp -> emp.getHireDate().isBefore(fiveyearAgo))
				.forEach(emp -> System.out.println(emp.getName() + "-joined on " + emp.getHireDate()));

//21.List employees who are "Female" and earn more than 30,00,000.
		System.out.println("\nFemale Employees earning more than 30,00,000:");
		employee.stream().filter(emp -> "female".equalsIgnoreCase(emp.getSex())).filter(emp -> emp.getCtc() > 3000000)
				.forEach(emp -> System.out.println(emp.getName() + " -salary" + emp.getCtc()));

//22.Find employees who are "Married" and work in "Marketing"
		System.out.println("\nMarried Employees working in Marketing:");
		employee.stream().filter(emp -> "married".equalsIgnoreCase(emp.getMaritalStatus()))
				.filter(emp -> "marketing".equalsIgnoreCase(emp.getDepartment()))
				.forEach(emp -> System.out.println(emp.getName() + "-departmen" + emp.getDepartment()));

//23.  Data Validation and Error Handling Questions Validate if there are any duplicate employee IDs in the list.

		Set<Integer> uniqueIds = new HashSet<>();
		Set<Integer> duplicateIds = employees.stream().map(Employee::getEid).filter(id -> !uniqueIds.add(id))
				.collect(Collectors.toSet());
		System.out.println("\nDuplicate Employee IDs:");
		if (duplicateIds.isEmpty()) {
			System.out.println("No duplicate employee IDs found.");
		} else {
			duplicateIds.forEach(System.out::println);
		}

//24.male Employees earning more than 30,00,000: 
		System.out.println("\nmale Employees earning more than 30,00,000:");
		employee.stream().filter(emp -> "Male".equalsIgnoreCase(emp.getSex())).filter(emp -> emp.getCtc() > 3000000)
				.forEach(emp -> System.out.println(emp.getName() + " -salary" + emp.getCtc()));

//25.single Employees working in Marketing
		System.out.println("\nsingle Employees working in Marketing:");
		employee.stream().filter(emp -> "single".equalsIgnoreCase(emp.getMaritalStatus()))
				.filter(emp -> "marketing".equalsIgnoreCase(emp.getDepartment()))
				.forEach(emp -> System.out.println(emp.getName() + "-departmen" + emp.getDepartment()));

//26. How many employees are earning more than ₹50,00,000?
		long highSalaryCount = employee.stream().filter(emp -> emp.getCtc() > 5000000).count();
		System.out.println("\nEmployees earning more than ₹50,00,000: " + highSalaryCount);

//27.name and salary employees are earning more than ₹50,00,000?
		System.out.println("\nEmployees name and  earning more than ₹50,00,000:");
		employee.stream().filter(emp -> emp.getCtc() > 5000000).collect(Collectors.toList())
				.forEach(emp -> System.out.println(emp.getName() + " - ₹" + emp.getCtc()));

//28.Which employees are earning between ₹20,00,000 and ₹30,00,000?
		System.out.println("\nemployees are earning between ₹20,00,000 and ₹30,00,00");

		employee.stream().filter(emp -> emp.getCtc() >= 2000000 && emp.getCtc() <= 3000000).collect(Collectors.toList())
				.forEach(emp -> System.out.println(emp.getName() + "-" + emp.getCtc()));

//29.How many employees are earning less than ₹10,00,000?
		System.out.println("\nHow many employees are earning less than ₹10,00,000?");
		employee.stream().filter(emp -> emp.getCtc() < 1000000).collect(Collectors.toList())
				.forEach(emp -> System.out.println(emp.getCtc() + "-" + emp.getName()));

//30.What is the age of the youngest employee?
		System.out.println("\n the age of the youngest employee");
		int youngestAge = employee.stream()
				.mapToInt(emp -> Period.between(emp.getBornDate(), LocalDate.now()).getYears()).min().orElseThrow();
		System.out.println("Youngest Employee Age: " + youngestAge);

//31.How many employees are above 30 years old?
		System.out.println("\nHow many employees are above 30 years old?");
		long above30 = employee.stream()
				.filter(emp -> Period.between(emp.getBornDate(), LocalDate.now()).getYears() > 30).count();
		System.out.println(above30);

//32.How many employees are below 25 years old?
		System.out.println("\nHow many employees are below 25 years old?");
		long below25 = employee.stream()
				.filter(emp -> Period.between(emp.getBornDate(), LocalDate.now()).getYears() < 25).count();
		System.out.println(below25);

//33.Who are the employees born in the 1990s?
		System.out.println("\nWho are the employees born in the 1990s?");
		employee.stream().filter(emp -> emp.getBornDate().getYear() >= 1990 && emp.getBornDate().getYear() < 2000)
				.collect(Collectors.toList()).forEach(emp -> System.out.println(emp.getName()));

//34.Who are the employees born in the 2000s?
		System.out.println("\nWho are the employees born in the 2000s?");
		employee.stream().filter(emp -> emp.getBornDate().getYear() >= 2000).collect(Collectors.toList())
				.forEach(emp -> System.out.println(emp.getName()));

//35. Who are the employees born before 1990?
		System.out.println("\nWho are the employees born before 1990?");
		employee.stream().filter(emp -> emp.getBornDate().getYear() < 1990).collect(Collectors.toList())
				.forEach(emp -> System.out.println(emp.getName()));

//36.What is the total salary paid to HR employees?
		System.out.println("\nWhat is the total salary paid to HR employees?");
		double totalHRSalaries = employee.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("HR"))
				.mapToDouble(Employee::getCtc).sum();
		System.out.println(totalHRSalaries);

//37. What is the total salary paid to Finance employees?
		System.out.println("\n What is the total salary paid to Finance employees?");
		double totalFinanceSalaries = employee.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("Finance"))
				.mapToDouble(Employee::getCtc).sum();

		System.out.println(totalFinanceSalaries);

//38.Which department has the highest total salary payout?
		System.out.println("\nWhich department has the highest total salary payout?");
		Map<String, Double> departmentSalaryMap = employee.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getCtc)));

		Map.Entry<String, Double> highestPaidDepartmentEntry = Collections.max(departmentSalaryMap.entrySet(),
				Map.Entry.comparingByValue());

		System.out.println("Department with the highest total salary payout: " + highestPaidDepartmentEntry.getKey()
				+ " (₹" + highestPaidDepartmentEntry.getValue() + ")");
		
//39.list of employee who has join after five year
		System.out.println("\nlist of employee ho has join after five year:");
		LocalDate fiveyearAfter=LocalDate.now().plusYears(5);
		employee.stream().filter(emp->emp.getHireDate().isAfter(fiveyearAfter)).forEach(emp->System.out.println(emp.getName()+"-joined on "+emp.getHireDate()));
		
		
		
	}
}
