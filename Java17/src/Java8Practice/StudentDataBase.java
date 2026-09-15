package Java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDataBase {
public static void main(String[] args) {
	 List<Student> students = Arrays.asList(
	            new Student(1, "kartik", 20, 85.5, "IT"),
	            new Student(2, "twinkle", 22, 78.0, "CS"),
	            new Student(3, "prince", 21, 92.3, "CS"),
	            new Student(4, "kundan", 23, 60.5, "EC"),
	            new Student(5, "kirtan", 22, 88.1, "CE"));
	// Filter students with grade greater than 80
	 List<Student>highresult=students.stream().filter(s->s.getGrade() >80).collect(Collectors.toList());
	 System.out.println("\nhigh result:");
	 highresult.forEach(System.out::println);
	 
	 // Get students sorted by grade in descending order
	List<Student>sortedGrade= students.stream().sorted(Comparator.comparingDouble(Student::getGrade).reversed()).collect(Collectors.toList());
	System.out.println("\nsortedGrade decendig order:");
	sortedGrade.forEach(System.out::println);
	
	 // Group students by stream
	 Map<String, List<Student>> studentsByStream = students.stream()
	            .collect(Collectors.groupingBy(Student::getStream));
	        System.out.println("\nStudents grouped by stream:");
	        studentsByStream.forEach((stream, list) -> {
	            System.out.println(stream + ": " + list);
	        });
	     // Calculate average grade of all students
	       double average=students.stream().mapToDouble(Student::getGrade).average().orElse(0.0);
	       System.out.println("\naverage:"+average);
}
}
