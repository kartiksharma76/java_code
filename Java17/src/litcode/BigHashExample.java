package litcode;

import java.util.*;

public class BigHashExample {

	static class Student {
		int id;
		String name;
		String branch;
		double marks;

		Student(int id, String name, String branch, double marks) {
			this.id = id;
			this.name = name;
			this.branch = branch;
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "ID: " + id + ", Name: " + name + ", Branch: " + branch + ", Marks: " + marks;
		}
	}

	public static void main(String[] args) {

		// HashMap
		HashMap<Integer, Student> students = new HashMap<>();

		// Adding students
		students.put(101, new Student(101, "Kartik", "IT", 85.5));
		students.put(102, new Student(102, "Rahul", "CSE", 78.5));
		students.put(103, new Student(103, "Aman", "IT", 91.0));
		students.put(104, new Student(104, "Rohit", "ECE", 72.5));
		students.put(105, new Student(105, "Ankit", "CSE", 88.0));

		// Display all students
		System.out.println("----- ALL STUDENTS -----");

		for (Map.Entry<Integer, Student> entry : students.entrySet()) {
			System.out.println(entry.getValue());
		}

		// Search student
		System.out.println("\n----- SEARCH STUDENT -----");

		int searchId = 103;

		if (students.containsKey(searchId)) {
			System.out.println("Student Found:");
			System.out.println(students.get(searchId));
		} else {
			System.out.println("Student Not Found");
		}

		// Update student
		System.out.println("\n----- UPDATE STUDENT -----");

		if (students.containsKey(102)) {
			Student s = students.get(102);
			s.marks = 82.5;

			System.out.println("Updated Student:");
			System.out.println(s);
		}

		// Delete student
		System.out.println("\n----- DELETE STUDENT -----");

		students.remove(104);

		System.out.println("Student 104 deleted.");

		// Size
		System.out.println("\nTotal Students: " + students.size());

		// HashSet
		HashSet<String> branches = new HashSet<>();

		branches.add("IT");
		branches.add("CSE");
		branches.add("ECE");
		branches.add("IT");
		branches.add("ME");

		System.out.println("\n----- UNIQUE BRANCHES -----");

		for (String branch : branches) {
			System.out.println(branch);
		}

		// Check branch
		System.out.println("\n----- CHECK BRANCH -----");

		if (branches.contains("IT")) {
			System.out.println("IT branch exists.");
		}

		// Remove branch
		branches.remove("ME");

		System.out.println("\nAfter removing ME:");
		System.out.println(branches);

		// HashMap frequency example
		System.out.println("\n----- CHARACTER FREQUENCY -----");

		String text = "programming";

		HashMap<Character, Integer> frequency = new HashMap<>();

		for (char ch : text.toCharArray()) {

			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// Find maximum marks
		System.out.println("\n----- TOPPER -----");

		Student topper = null;

		for (Student s : students.values()) {

			if (topper == null || s.marks > topper.marks) {
				topper = s;
			}
		}

		System.out.println("Topper:");
		System.out.println(topper);
	}
}