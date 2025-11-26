package Stream;

import java.util.*;
import java.util.stream.*;

class Student {
	String name;
	String grade;

	Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class GroupStudyByGrade {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Alice", "A"), new Student("Bob", "B"),
				new Student("Charlie", "A"), new Student("David", "B"));

		Map<String, List<Student>> grouped = students.stream().collect(Collectors.groupingBy(s -> s.grade));
		System.out.println(grouped);
		// {A=[Alice, Charlie], B=[Bob, David]}
	}
}
