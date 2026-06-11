package array2026;

import java.util.ArrayList;
import java.util.Collections;

class Student {
	int id;
	String name;
	int marks;

	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class SortStudentObjectsbyMarks {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(1, "A", 80));
		list.add(new Student(2, "B", 95));
		list.add(new Student(3, "C", 70));

		Collections.sort(list, (s1, s2) -> s2.marks - s1.marks);

		for (Student s : list) {
			System.out.println(s.name + " " + s.marks);
		}
	}
}
