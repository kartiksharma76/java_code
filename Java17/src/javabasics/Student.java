package javabasics;

public class Student {
	public String name = "Kartik Sharma";
	public int rollNumber = 789;
	public String college = "Sagar Institute of Research and Technology ";
	public char section = 'B';

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