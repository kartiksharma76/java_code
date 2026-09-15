package StreamAPI;

/**
 --------------------------Basic Level (Filtering, Mapping, Sorting)-----------------------------------

Print all students’ names.

Print names of students whose department is "Computer Science".

Find all male students.

Find all female students who study in "IT" department.

Sort all students by name in ascending order.

Sort all students by fees (highest to lowest).

Print names of students who joined after the year 2022.

Find all students whose fees are more than ₹50,000.

Find all students whose campus location is "Bhopal".

Print only the names and departments of all students.

--------------------------- Intermediate Level (Aggregation, Grouping, Counting)------------------------

Count total number of students.

Count total number of male and female students.

Find average fees of all students.

Find average fees of students department-wise.

Find total fees collected by each department.

Find highest fee-paying student in each department.

Find youngest and oldest student.

Find the student who joined earliest.

Group students by marital status (Single / Married).

Find number of students admitted each year.

-----------------------------Advanced Level (Complex Queries)-------------------------------------

Find top 3 students who pay the highest fees.

Find department having maximum number of students.

Find average fees of male vs female students.

Find distinct department names.

Check if any student studies "Artificial Intelligence" course.

Check if all students pay more than ₹20,000 fees.

Find students whose name starts with “A”.

Find second highest fee-paying student.

Find total number of departments available in the college.

Print list of students grouped by campus location.

Print department names in alphabetical order (no duplicates).

Find the most recently admitted student in each department.

Find students born before 2002.

Find total fees collected at each campus location.

Find students having "Data" word in their course name.

Partition students into two groups – those paying more than ₹60,000 and those paying less.

Get list of all student names as a single comma-separated string.

Find total number of distinct courses offered.

Find the student who pays minimum fees.

Group students by department, then sort each group by fees descending.
 */
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProblemPracticeStudent {

	public static void main(String[] args) {
		List<Student2> students = StudentDatabase.getStudents2();

		System.out.println("All Students:");
		students.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nAll Male Students:");
		students.stream().filter(s -> s.getGender().equalsIgnoreCase("Male"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nAll Female Students:");
		students.stream().filter(s -> s.getGender().equalsIgnoreCase("Female"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nSingle Students:");
		students.stream().filter(s -> s.getMaritalStatus().equalsIgnoreCase("Single"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nMarried Students:");
		students.stream().filter(s -> s.getMaritalStatus().equalsIgnoreCase("Married"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nStudents from Bangalore:");
		students.stream().filter(s -> s.getCampusLocation().equalsIgnoreCase("Bangalore"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nSorted by Name:");
		students.stream().sorted(Comparator.comparing(Student2::getName)).forEach(s -> System.out.println(s.getName()));

		System.out.println("\nSorted by Fees (Desc):");
		students.stream().sorted(Comparator.comparingLong(Student2::getFees).reversed())
				.forEach(s -> System.out.println(s.getName() + " - " + s.getFees()));

		System.out.println("\nHighest Fees:");
		students.stream().max(Comparator.comparingLong(Student2::getFees))
				.ifPresent(s -> System.out.println(s.getName() + " - " + s.getFees()));

		System.out.println("\nLowest Fees:");
		students.stream().min(Comparator.comparingLong(Student2::getFees))
				.ifPresent(s -> System.out.println(s.getName() + " - " + s.getFees()));

		System.out.println("\nGroup by Department:");
		students.stream().collect(Collectors.groupingBy(Student2::getDepartment)).forEach((dept, list) -> {
			System.out.println(dept + " -> " + list.stream().map(Student2::getName).collect(Collectors.joining(", ")));
		});

		System.out.println("\nCount by Department:");
		students.stream().collect(Collectors.groupingBy(Student2::getDepartment, Collectors.counting()))
				.forEach((d, c) -> System.out.println(d + " : " + c));

		System.out.println("\nAverage Fees per Department:");
		students.stream()
				.collect(Collectors.groupingBy(Student2::getDepartment, Collectors.averagingDouble(Student2::getFees)))
				.forEach((d, avg) -> System.out.println(d + " : " + avg));

		System.out.println("\nDistinct Courses:");
		students.stream().map(Student2::getCourseName).distinct().forEach(System.out::println);

		System.out.println("\nAdmitted After 2021:");
		students.stream().filter(s -> s.getAdmissionDate().isAfter(LocalDate.of(2021, 12, 31)))
				.forEach(s -> System.out.println(s.getName() + " : " + s.getAdmissionDate()));

		System.out.println("\nBorn before 2002:");
		students.stream().filter(s -> s.getBirthday().isBefore(LocalDate.of(2002, 1, 1)))
				.forEach(s -> System.out.println(s.getName() + " : " + s.getBirthday()));

		System.out.println("\nAverage Fees of All:");
		double avgFees = students.stream().collect(Collectors.averagingDouble(Student2::getFees));
		System.out.println(avgFees);

		System.out.println("\nTotal Fees:");
		long total = students.stream().mapToLong(Student2::getFees).sum();
		System.out.println(total);

		System.out.println("\nFees between 1L and 5L:");
		students.stream().filter(s -> s.getFees() >= 100000 && s.getFees() <= 500000)
				.forEach(s -> System.out.println(s.getName() + " - " + s.getFees()));

		System.out.println("\nGroup by Campus Location:");
		students.stream().collect(Collectors.groupingBy(Student2::getCampusLocation))
				.forEach((loc, list) -> System.out.println(loc + " → " + list.size()));

		System.out.println("\nMarital Status Count:");
		students.stream().collect(Collectors.groupingBy(Student2::getMaritalStatus, Collectors.counting()))
				.forEach((m, c) -> System.out.println(m + " : " + c));

		System.out.println("\nFemale Students in Bangalore:");
		students.stream().filter(
				s -> s.getGender().equalsIgnoreCase("Female") && s.getCampusLocation().equalsIgnoreCase("Bangalore"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nName Starts with S:");
		students.stream().filter(s -> s.getName().startsWith("S")).forEach(s -> System.out.println(s.getName()));

		System.out.println("\nStudents Enrolled in MBA:");
		students.stream().filter(s -> s.getCourseName().toLowerCase().contains("mba"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nSort by Admission Date:");
		students.stream().sorted(Comparator.comparing(Student2::getAdmissionDate))
				.forEach(s -> System.out.println(s.getName() + " : " + s.getAdmissionDate()));

		System.out.println("\nDepartment with Highest Avg Fees:");
		students.stream()
				.collect(Collectors.groupingBy(Student2::getDepartment, Collectors.averagingDouble(Student2::getFees)))
				.entrySet().stream().max(Map.Entry.comparingByValue())
				.ifPresent(e -> System.out.println(e.getKey() + " : " + e.getValue()));

		System.out.println("\nDistinct Campus Locations:");
		students.stream().map(Student2::getCampusLocation).distinct().forEach(System.out::println);

		System.out.println("\nDuplicate Names:");
		students.stream().collect(Collectors.groupingBy(Student2::getName, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()));

		System.out.println("\nMap of Name -> Fees:");
		Map<String, Long> nameFees = students.stream()
				.collect(Collectors.toMap(Student2::getName, Student2::getFees, (v1, v2) -> v1));
		nameFees.forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println("\nOldest Student:");
		students.stream().min(Comparator.comparing(Student2::getBirthday))
				.ifPresent(s -> System.out.println(s.getName() + " : " + s.getBirthday()));

		System.out.println("\nYoungest Student:");
		students.stream().max(Comparator.comparing(Student2::getBirthday))
				.ifPresent(s -> System.out.println(s.getName() + " : " + s.getBirthday()));

		System.out.println("\nGroup by Gender:");
		students.stream().collect(Collectors.groupingBy(Student2::getGender))
				.forEach((g, list) -> System.out.println(g + " → " + list.size()));

		System.out.println("\nHighest Fees per Department:");
		students.stream()
				.collect(Collectors.groupingBy(Student2::getDepartment,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student2::getFees)),
								Optional::get)))
				.forEach((d, s) -> System.out.println(d + " -> " + s.getName() + " : " + s.getFees()));

		System.out.println("\nNames containing 'a':");
		students.stream().filter(s -> s.getName().toLowerCase().contains("a"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nCount of Departments:");
		long deptCount = students.stream().map(Student2::getDepartment).distinct().count();
		System.out.println(deptCount);

		System.out.println("\nReverse Sort by Name:");
		students.stream().sorted(Comparator.comparing(Student2::getName).reversed())
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nCourses starting with B:");
		students.stream().map(Student2::getCourseName).filter(c -> c.startsWith("B")).distinct()
				.forEach(System.out::println);

		System.out.println("\nStudents by Admission Year:");
		students.stream().collect(Collectors.groupingBy(s -> s.getAdmissionDate().getYear(), Collectors.counting()))
				.forEach((y, c) -> System.out.println(y + " : " + c));

		System.out.println("\nStudents in Finance Dept:");
		students.stream().filter(s -> s.getDepartment().equalsIgnoreCase("Finance"))
				.forEach(s -> System.out.println(s.getName()));

		System.out.println("\nTotal Number of Students: " + students.size());
	}
}
