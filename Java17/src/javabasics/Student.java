package javabasics;

public class Student {
	public String name = "Kundan Kumar";
	public int rollNumber = 456;
	public String college = "APJ abdul kalam";
	public char section = 'A';

	public static void main(String[] args) {
		Student student = new Student();
		String name = student.name;
		System.out.println(name);
		// System.out.println(student.name);
		int rollNumber=student.rollNumber;
		System.out.println(rollNumber);
		String college = student.college;
		System.out.println(college);
		char section = student.section;
		System.out.println(section);
		
	}
}