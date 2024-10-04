package javabasics;

public class StudentGradingSystem {
	public static void main(String[] args) {
		int[] studentMarks = { 85, 92, 33, 77, 69 };
		for (int marks : studentMarks) {
			char grade = calculateGrade(marks);
			System.out.println("Student with marks " + marks + " gets grade: " + grade);
		}
	}

	public static char calculateGrade(int marks) {
		if (marks >= 90) {
			return 'A';
		} else if (marks >= 80) {
			return 'B';
		} else if (marks >= 70) {
			return 'C';
		} else if (marks >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
