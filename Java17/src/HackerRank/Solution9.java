package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
/**
 * 12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50

 */
class Student1 {
	private int id;
	private String name;
	private double cgpa;

	public Student1(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;

	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCGPA() {
		return cgpa;
	}
}

class Priorities {
	public List<Student1> getStudents(List<String> events) {
		PriorityQueue<Student1> pq = new PriorityQueue<>(new Comparator<Student1>() {
			public int compare(Student1 s1, Student1 s2) {
				// Highest CGPA first
				if (Double.compare(s2.getCGPA(), s1.getCGPA()) != 0) {
					return Double.compare(s2.getCGPA(), s1.getCGPA());
				}
				// If CGPA same, compare by name (ascending)
				int nameCompare = s1.getName().compareTo(s2.getName());
				if (nameCompare != 0) {
					return nameCompare;
				}
				// If name same, compare by ID (ascending)
				return s1.getID() - s2.getID();
			}
		});
		for (String event : events) {
			if (event.startsWith("ENTER")) {
				String[] parts = event.split(" ");
				String name = parts[1];
				double cgpa = Double.parseDouble(parts[2]);
				int id = Integer.parseInt(parts[3]);
				pq.add(new Student1(id, name, cgpa));
			} else if (event.equals("SERVED")) {
				pq.poll(); // Remove highest priority student
			}
		}
		List<Student1> result = new ArrayList<>();
		while (!pq.isEmpty()) {
			result.add(pq.poll());
		}
		return result;
	}
}

public class Solution9 {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student1> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student1 st : students) {
				System.out.println(st.getName());
			}
		}
	}
}