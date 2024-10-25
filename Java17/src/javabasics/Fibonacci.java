package javabasics;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 10;
		int firstnumber = 0;
		int secondnumber = 1;

		System.out.println("fibonacci search +n+term:");
		for (int i = 1; i <= n; i++) {
			System.out.println(firstnumber + " ");
			int nextnumber = firstnumber + secondnumber;
			secondnumber = firstnumber;
			firstnumber = nextnumber;

		}
	}
}