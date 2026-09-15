package WinterVac;

public class Operater {
	public static int sum(int a, int b) {
		return (a + b);

	}

	public static int sub(int a, int b) {
		return (a - b);

	}

	public static int multiply(int a, int b) {
		return (a * b);

	}

	public static int divide(int a, int b) {
		return (a / b);

	}

	public static void main(String[] args) {
		Operater o = new Operater();
		System.out.println(o.sum(10, 2));
		System.out.println(o.sub(10, 2));
		System.out.println(o.multiply(10, 2));
		System.out.println(o.divide(10, 2));
	}
}
