package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student1 {
	String name, grade;

	Student1(String n, String g) {
		name = n;
		grade = g;
	}
}

public class GroupCount {
	public static void main(String[] args) {
		List<Student1> students = Arrays.asList(new Student1("Alice", "A"), new Student1("Bob", "B"),
				new Student1("Charlie", "A"));

		Map<String, Long> count = students.stream().collect(Collectors.groupingBy(s -> s.grade, Collectors.counting()));
		System.out.println(count);
	}
}
