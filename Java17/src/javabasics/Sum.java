package javabasics;

public class Sum {
	public int sum(int a, int b) {
		return (a + b);

	}

	public int sum(int a, int b, int c) {
		return (a + b + c);

	}

	public double sum(double a, double b) {
		return (a + b);

	}

	public static void main(String[] args) {
		Sum s = new Sum();

		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.2, 20.4));
	}
}
