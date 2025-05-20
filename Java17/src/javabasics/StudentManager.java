package javabasics;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		Student1[] student1s = new Student1[n];
		for (int i = 0; i < n; i++) {
			student1s[i] = new Student1();
			System.out.println("Enter name of student:" + (i + 1) + ":");
			String name = sc.nextLine();
			int[] marks = new int[3];
			System.out.println("enter 3 subjects marks:");
			for (int j = 0; j < 3; j++) {
				System.out.print("Mark " + (j + 1) + ": ");
				marks[j]=sc.nextInt();
			}
			sc.nextLine();

			student1s[i].setDetails(name, marks);

		}
		System.out.println("\n---passed student---");
		for (Student1 s : student1s) {
			if (s.isPassed()) {
				System.out.println(s.getname() + " -Avg:" + s.calculateAverge());

			}
		}
		sc.close();
	}
}
