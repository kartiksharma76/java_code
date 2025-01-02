package array;

public class NameAndRollArray {
	public static void main(String[] args) {

		int numberOfStudents = 25;

		String[] studentNames = new String[numberOfStudents];
		int[] rollNumbers = new int[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			studentNames[i] = "Student" + (i + 1);
			rollNumbers[i] = i + 1;
		}

		System.out.println("Student Details:");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Roll No: " + rollNumbers[i] + ", Name: " + studentNames[i]);
		}
	}
}
