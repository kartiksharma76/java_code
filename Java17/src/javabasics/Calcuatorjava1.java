package javabasics;

public class Calcuatorjava1 {

	public static int addition(int d1, int e1, int k1, int l1) {
		return d1 + e1 + k1 + l1;

	}

	public static int subtraction(int c, int d, int h1, int q1) {
		return c - d - h1 - q1;
	}

	public static int division(int r, int e, int a, int b) {
		return r / e / a / b;
	}

	public static int multiplication(int s1, int f1, int y1) {
		return s1 * f1 * y1;
	}

	public static void main(String[] args) {

		Calcuatorjava1 calcuatorjava1 = new Calcuatorjava1();

		int sum = Calcuatorjava1.addition(30, 30, 30, 30);

		System.out.println(sum);

		int div = Calcuatorjava1.division(35, 45, 55, 65);

		System.out.println(div);

		int multiply = Calcuatorjava1.multiplication(90, 98, 67);

		System.out.println(multiply);

		int sub = Calcuatorjava1.subtraction(50, 78, 76, 34);

		System.out.println(sub);

	}

}