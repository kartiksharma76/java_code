package javabasics;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10, firstTerm = 0, SecondTerm = 1;
		System.out.println("fibonacci series" + n + " term:");
		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");
			int NextTerm = firstTerm + SecondTerm;
			firstTerm = SecondTerm;
			SecondTerm = NextTerm;

		}
	}
}
