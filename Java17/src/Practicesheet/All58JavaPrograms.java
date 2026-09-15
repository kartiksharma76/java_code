package Practicesheet;

/**
 * Java Programs – Complete Practice Question List
Simple Java program example
Java program to use class and objects
Java program using constructor
Java program using static variable and static method
Java program using interface
Java program using abstract class
Java program to use this keyword
Java program to use super keyword
Java program using double variable
Java program for method overloading

Command Line & Input Programs
Java program to take command line arguments
Java program to print sum of command line arguments

Decision Making & Control Statements
Java program to compare two numbers using if-else
Java program using conditional operators
Java program using switch case
Java program to use nested switch case
Java program to check for leap year

Loops & Number Logic
Java program to display multiplication table
Java program to swap two values
Java program to convert days into months
Java program to generate random numbers between 1 to 100
Java program to find sum and product of digits of a number
Java program to find the sum of integers divisible by 7
Java program to find Armstrong number
Java program to generate harmonic series
Java program to find factorial
Java program to print factorial using recursion
Java program to calculate area of circle using radius

Prime, Fibonacci & Series
Java program to check prime number
Java program to print N prime numbers
Java program to print prime numbers between a given range
Java program to print Fibonacci series
Java program to print Fibonacci series using array

Palindrome & String Programs
Java program to check palindrome number
Java program to check list of numbers in palindrome
Java program to concatenate string using for loop
Java program to print characters of integers

Java program to use equals() function
Even, Odd & Average
Java program to print list of even numbers
Java program to print even numbers between a range
Java program to find average of consecutive N odd numbers
Java program to find average of consecutive N even numbers

Exception & GUI
Java program for handling an exception
Java program to handle an action event
Java Swing program to calculate square of a number
Applet & Pattern Programs
Java program to print shapes using applet
Star & Number Pattern Programs
Java program to print star pattern in triangle shape
Java program to print star pattern in reverse triangle shape
Java program to print star pattern in pyramid shape
Java program to print star pattern in reverse pyramid shape
Java program to print star pattern in diamond shape
Java program to print star pattern in square shape
Java program to print number pattern in triangle shape
Java program to print number pattern in reverse triangle shape
Java program to print a pyramid of numbers using for loop
Java program to print FLOYD’S triangle
Java program to print 15+ different pattern programs
Basic Arithmetic
Java program for addition of two numbers
Java program for subtraction of two numbers
 */
import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class All58JavaPrograms {

	// 1. static variable
	static int staticVar = 10;

	// 2. constructor
	All58JavaPrograms() {
		System.out.println("Constructor called");
	}

	// 3. static method
	static void staticMethod() {
		System.out.println("Static Method");
	}

	// 4. method overloading
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	// 5. recursion factorial
	static int fact(int n) {
		return (n == 0) ? 1 : n * fact(n - 1);
	}

	public static void main(String[] args) {

		// Object + constructor
		new All58JavaPrograms();
		staticMethod();

		// 6. simple program
		System.out.println("Simple Java Program");

		// 7. double variable
		double d = 12.5;
		System.out.println(d);

		// 8. command line arguments
		for (String s : args)
			System.out.print(s + " ");
		System.out.println();

		// 9. sum of command line arguments
		int cmdSum = 0;
		for (String s : args)
			cmdSum += Integer.parseInt(s);
		System.out.println(cmdSum);

		// 10. equals()
		System.out.println("Java".equals("Java"));

		// 11. conditional operator
		int a = 10, b = 20;
		System.out.println(a > b ? a : b);

		// 12. if else compare
		if (a > b)
			System.out.println(a);
		else
			System.out.println(b);

		// 13. switch case
		int day = 2;
		switch (day) {
		case 1 -> System.out.println("Mon");
		case 2 -> System.out.println("Tue");
		}

		// 14. nested switch
		int x = 1, y = 2;
		switch (x) {
		case 1:
			switch (y) {
			case 2 -> System.out.println("Nested Switch");
			}
		}

		// 15. random number 1–100
		System.out.println((int) (Math.random() * 100 + 1));

		// 16. swap two numbers
		int p = 5, q = 10;
		p = p + q;
		q = p - q;
		p = p - q;
		System.out.println(p + " " + q);

		// 17. fibonacci
		int f1 = 0, f2 = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.print(f1 + " ");
			int f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println();

		// 18. fibonacci using array
		int[] fib = new int[5];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < 5; i++)
			fib[i] = fib[i - 1] + fib[i - 2];
		System.out.println(Arrays.toString(fib));

		// 19. prime check
		int n = 7, flag = 0;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				flag = 1;
		System.out.println(flag == 0);

		// 20. prime between range
		for (int i = 2; i <= 20; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++)
				if (i % j == 0)
					prime = false;
			if (prime)
				System.out.print(i + " ");
		}
		System.out.println();

		// 21. N prime numbers
		int count = 0;
		for (int i = 2; count < 5; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++)
				if (i % j == 0)
					prime = false;
			if (prime) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();

		// 22. palindrome number
		int num = 121, rev = 0, temp = num;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println(num == rev);

		// 23. list palindrome
		int[] arr = { 121, 131, 20 };
		for (int i : arr)
			System.out.println(i == Integer.parseInt(new StringBuilder("" + i).reverse().toString()));

		// 24. armstrong
		int arm = 153, r, sum = 0;
		temp = arm;
		while (temp > 0) {
			r = temp % 10;
			sum += r * r * r;
			temp /= 10;
		}
		System.out.println(sum == arm);

		// 25. factorial
		System.out.println(fact(5));

		// 26. factorial recursion (same above)

		// 27. sum & product of digits
		int sd = 123, s = 0, pr = 1;
		while (sd > 0) {
			int dg = sd % 10;
			s += dg;
			pr *= dg;
			sd /= 10;
		}
		System.out.println(s + " " + pr);

		// 28. divisible by 7
		int total = 0;
		for (int i = 1; i <= 50; i++)
			if (i % 7 == 0)
				total += i;
		System.out.println(total);

		// 29. Concatenate string using loop
		String res = "";
		for (char c : "JAVA".toCharArray()) {
			res += c;
		}
		System.out.println(res);

		// 30. multiplication table
		for (int i = 1; i <= 10; i++)
			System.out.println("5x" + i + "=" + (5 * i));

		// 31. days to months
		int days = 90;
		System.out.println(days / 30);

		// 32. print characters of integer
		int val = 123;
		for (char c : ("" + val).toCharArray())
			System.out.println(c);

		// 33. harmonic series
		double h = 0;
		for (int i = 1; i <= 5; i++)
			h += 1.0 / i;
		System.out.println(h);

		// 34. avg of N odd & even
		int eo = 0, ec = 0, os = 0, es = 0;
		for (int i = 1; i <= 10; i++)
			if (i % 2 == 0) {
				es += i;
				ec++;
			} else {
				os += i;
				eo++;
			}
		System.out.println((os / eo) + " " + (es / ec));

		// 35. even numbers
		for (int i = 1; i <= 10; i++)
			if (i % 2 == 0)
				System.out.print(i + " ");
		System.out.println();

		// 36. even between range
		for (int i = 10; i <= 20; i++)
			if (i % 2 == 0)
				System.out.print(i + " ");
		System.out.println();

		// 37. leap year
		int yr = 2024;
		System.out.println(yr % 4 == 0);

		// 38. area of circle
		int rad = 7;
		System.out.println(3.14 * rad * rad);

		// 39. addition
		System.out.println(5 + 3);

		// 40. subtraction
		System.out.println(5 - 3);

		// 41–55. PATTERNS (15+)

		// star triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		// reverse triangle
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		// square
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++)
				System.out.print("*");
			System.out.println();
		}

		// pyramid
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}

		// reverse pyramid
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 4 - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}

		// diamond
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 2; i >= 1; i--) {
			for (int j = 3; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}

		// Floyd triangle
		int c = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(c++ + " ");
			System.out.println();
		}

		// number triangle
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}

		// reverse number triangle
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}

		// 56. Swing square
		JFrame f = new JFrame("Square");
		JTextField t = new JTextField(10);
		JButton btn = new JButton("Square");
		btn.addActionListener(e -> JOptionPane.showMessageDialog(f, Math.pow(Integer.parseInt(t.getText()), 2)));
		f.setLayout(new FlowLayout());
		f.add(t);
		f.add(btn);
		f.setSize(200, 150);
		f.setVisible(true);
	}
}
