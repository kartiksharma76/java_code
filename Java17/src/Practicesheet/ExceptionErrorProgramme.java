package Practicesheet;

/**
 *  Exceptions and Errors Programs
1. Java Program to Show Runtime exceptions
2. Java Program to Show Types of errors
3. Java Program to Handle the Exception Hierarchies
4. Java Program to Handle the Exception Methods
5. Java program to Handle the Checked exceptions
6. Java Program to Handle the Unchecked Exceptions
7. Java Program to Handle Divide By Zero and Multiple Exceptions
8. Java Program to Show Unreachable Code Error
9. Java Program to Show Thread interface and memory consistency errors
 */
import java.io.*;

public class ExceptionErrorProgramme implements Runnable {

	public static void main(String[] args) {

		// 1. Runtime Exception (ArithmeticException)
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Runtime Exception: " + e);
		}

		// 2. Types of Errors
		try {
			int[] arr = new int[3];
			arr[5] = 10; // ArrayIndexOutOfBounds
		} catch (Error e) {
			System.out.println("Error occurred: " + e);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}

		// 3. Exception Hierarchy handling
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught");
		} catch (Exception e) {
			System.out.println("Parent Exception caught");
		}

		// 4. Exception Methods
		try {
			int x = 10 / 0;
		} catch (Exception e) {
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("toString(): " + e.toString());
			e.printStackTrace();
		}

		// 5. Checked Exception
		try {
			FileReader fr = new FileReader("file.txt");
		} catch (IOException e) {
			System.out.println("Checked Exception handled");
		}

		// 6. Unchecked Exception
		try {
			int[] a = new int[2];
			a[3] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Unchecked Exception handled");
		}

		// 7. Divide by Zero + Multiple Exceptions
		try {
			int b = 10 / 0;
			int[] a = new int[2];
			a[5] = 10;
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index error");
		}

		// 8. Unreachable Code (commented to avoid compile error)
		/*
		 * return; System.out.println("This code is unreachable");
		 */

		System.out.println("Unreachable code example shown via comment");

		// 9. Thread interface & memory consistency
		Thread t = new Thread(new ExceptionErrorProgramme());
		t.start();
	}

	// Thread interface run()
	public void run() {
		System.out.println("Thread running using Runnable interface");
	}
}
