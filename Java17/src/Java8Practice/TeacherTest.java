package Java8Practice;

/**
 * 1).get all teacher name
 * 2).Get all ages
 * 3).Get all Subjects
 * 4).Get all Salaries
 * 5).Get all Permanent Status
 * 6).Find all teachers who are permanent
 * 7).Bonus: Sort teachers by salary descending
 * 8).accending order salary
 * 9).print name and age
 * 10).print name and salary
 * 11).print name and subject
 * 12).Teachers who are permanent
 * 13).Teachers who are NOT permanent
 * 14).Soretd by age decending
 */
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherTest {
	public static void main(String[] args) {

		List<Teacher> teachers = List.of(new Teacher("Divya khade", 27, "ADA", 50000, true),
				new Teacher("Priya sharma", 32, "ADC", 48000, false),
				new Teacher("Rajiv shukla", 40, "M3", 52000, true),
				new Teacher("Rajiv saxena", 35, "COA", 60000, false),
				new Teacher("Rabiya Hanfi", 29, "DBMS", 30000, false),
				new Teacher("Richa singh", 33, "Lab DBMS", 40000, false));

// get all teacher name
		System.out.println("\nget all teacher name:");
		List<String> names = teachers.stream().map(Teacher::getName).collect(Collectors.toList());
		names.forEach(System.out::println);
// Get all ages
		System.out.println("\nGet all ages:");
		List<Integer> ages = teachers.stream().map(Teacher::getAge).collect(Collectors.toList());
		ages.forEach(System.out::println);

//Get all Subjects
		System.out.println("\nGet all Subjects:");
		List<String> subjects = teachers.stream().map(Teacher::getSubject).collect(Collectors.toList());
		subjects.forEach(System.out::println);

//Get all Salaries
		System.out.println("\nGet all Salaries:");
		List<Double> salaries = teachers.stream().map(Teacher::getSalary).collect(Collectors.toList());
		salaries.forEach(System.out::println);

//Get all Permanent Status
		System.out.println("\nGet all Permanent Status:");
		List<Boolean> permanentStatus = teachers.stream().map(Teacher::isPermanent).collect(Collectors.toList());
		permanentStatus.forEach(System.out::println);

//Find all teachers who are permanent
		System.out.println("\nFind all teachers who are permanent:");
		List<Teacher> permanentTeachers = teachers.stream().filter(Teacher::isPermanent).collect(Collectors.toList());
		permanentTeachers.forEach(System.out::println);

//Bonus: Sort teachers by salary descending
		System.out.println("\nBonus: Sort teachers by salary descending:");
		List<Teacher> sortedBySalary = teachers.stream()
				.sorted(Comparator.comparingDouble(Teacher::getSalary).reversed()).collect(Collectors.toList());
		sortedBySalary.forEach(System.out::println);

// accending order salary
		System.out.println("\naccending order salary:");
		List<Teacher> sortedBySalaryAsc = teachers.stream().sorted(Comparator.comparingDouble(Teacher::getSalary))
				.collect(Collectors.toList());
		sortedBySalaryAsc.forEach(System.out::println);

// print name and age
		System.out.println("\nprint name and age:");
		teachers.stream().forEach(teacher -> System.out.println(teacher.getName() + ": " + teacher.getAge()));

//print name and salary
		System.out.println("\nprint name and salary:");
		teachers.stream().forEach(teacher -> System.out.println(teacher.getName() + ": " + teacher.getSalary()));

//print name and subject
		System.out.println("\nprint name and subject:");
		teachers.stream().forEach(teacher -> System.out.println(teacher.getName() + ": " + teacher.getSubject()));

//Teachers who are permanent
		System.out.println("\nTeachers who are permanent:");
		List<Teacher> permanent = teachers.stream().filter(Teacher::isPermanent).collect(Collectors.toList());
		permanent.forEach(System.out::println);

//Teachers who are NOT permanent
		System.out.println("\nTeachers who are NOT permanent:");
		List<Teacher> notPermanentTeachers = teachers.stream().filter(teacher -> !teacher.isPermanent())
				.collect(Collectors.toList());
		notPermanentTeachers.forEach(System.out::println);
		System.out.println("\nTeachers sorted by age (descending):");

// Soretd by age decending
		System.out.println("\nSoretd by age decending:");
		List<Teacher> sortedByAgeDesc = teachers.stream().sorted(Comparator.comparingInt(Teacher::getAge).reversed())
				.collect(Collectors.toList());
		sortedByAgeDesc.forEach(System.out::println);
	}
}