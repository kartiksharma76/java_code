package Practicesheet;

import java.util.*;
import java.util.stream.*;

/**
 * Java Methods Programs 1. Java Program to Show Usage of Main() method 2. Java
 * Program to Show Use of Static and Non-static Methods 3. Java Program to Show
 * Usage of forEach() Method 4. Java Program to Show Usage of toString() Method
 * 5. Java Program to Show Usage of codePointAt() Method 6. Java Program to Show
 * Usage of compare() Method 7. Java Program to Show Usage of equals() Method 8.
 * Java Program to Show Usage of hasNext() and next() Method 9. Thread Lifecycle
 * Methods a. start() Method b. run() Method
 */
public class JavaMethodsProgramme {

	// 2. Non-static method
	void nonStaticMethod() {
		System.out.println("Non-static method called");
	}

	// 4. toString() method
	public String toString() {
		return "Custom toString() method output";
	}

	// 9. Thread Lifecycle – run()
	public void run() {
		System.out.println("Thread is running using run() method");
	}

	public static void main(String[] args) {

		// 1. Usage of main() method
		System.out.println("Main method started");

		JavaMethodsProgramme obj = new JavaMethodsProgramme();

		// 2. Static & Non-static methods
		staticMethod();
		obj.nonStaticMethod();

		// 3. forEach() method
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.forEach(n -> System.out.print(n + " "));
		System.out.println();

		// 4. toString() method
		System.out.println(obj.toString());

		// 5. codePointAt() method
		String str = "JAVA";
		System.out.println("CodePointAt index 1: " + str.codePointAt(1));

		// 6. compare() method
		Integer a = 10, b = 20;
		System.out.println("Compare result: " + Integer.compare(a, b));

		// 7. equals() method
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("Equals result: " + s1.equals(s2));

		// 8. hasNext() and next() method
		ArrayList<String> names = new ArrayList<>();
		names.add("A");
		names.add("B");
		names.add("C");

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		// 9a. Thread Lifecycle – start()
		Thread t = new Thread(() -> {
			System.out.println("Thread started using start()");
		});
		t.start();

		// 9b. Thread Lifecycle – run()
		obj.run();
	}

	// 2. Static method
	static void staticMethod() {
		System.out.println("Static method called");
	}
}
