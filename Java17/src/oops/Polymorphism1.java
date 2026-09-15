package oops;

class Calsi {
	public int add(int a, int b) {
		return a + b;

	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Polymorphism1 {
	public static void main(String[] args) {
		Calsi c = new Calsi();

		System.out.println("Sum1: " + c.add(5, 10));
		System.out.println("Sum2: " + c.add(5, 10, 15));
	}
}
