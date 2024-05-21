package javabasics;

import java.io.PrintStream;

public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.rollNumber);
		System.out.println(student.section);
		System.out.println(student.college);
		PrintStream out = java.lang.System.out;
		out.println("Hello Kartik");
	}

}
