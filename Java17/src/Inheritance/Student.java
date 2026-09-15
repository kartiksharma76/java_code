package Inheritance;

import java.util.Scanner;

public class Student {
	private char name[];
	private float marks1, marks2, marks3;
	private float division;

	// Default constructor
	public Student() {
		String name = "";
		marks1 = marks2 = marks3 = 0.0f;
		division = 0.0f;
	}

	// Parameterized constructor to initialize all attributes
	public Student(char[] name, float marks1, float marks2, float marks3) {
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		calculateDivision();
	}

	// Function to take input from the user
	public void inputDetails() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scanner.nextLine().toCharArray();

		System.out.print("Enter marks in 3 subjects: ");
		marks1 = scanner.nextFloat();
		marks2 = scanner.nextFloat();
		marks3 = scanner.nextFloat();

		calculateDivision();
	}

	// Function to calculate the division
	private void calculateDivision() {
		division = (marks1 + marks2 + marks3) / 3;
	}

	// Function to print student details
	public void printDetails() {
		System.out.println("Name: " + new String(name));
		System.out.println("Marks in 3 subjects: " + marks1 + ", " + marks2 + ", " + marks3);
		System.out.println("Division: " + division);
	}

	// Destructor (not explicitly defined in Java)
	// Garbage collector automatically handles object destruction
}
