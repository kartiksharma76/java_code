package NPTL25;

import java.util.Scanner;

public class W04_P1 {
	static class Student {
		int rollNo;

		public Student(int r) {
			rollNo = r;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		Student s = new Student(r);

		System.out.println("Roll Number is :" + s.rollNo);

		sc.close();
	}
}
