package operaters;

public class ArthematicOperators {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2;
		System.out.println(b3);

		long a = 10;
		int b = 20;
		long c = (long) (a + b);
		System.out.println(c);

		float f = 10;
		double d = 20;
		double g = (double) (f + d);
		System.out.println(g);

		int a1 = 10;
		int a2 = 20;
		a2 = a2 - a1;
		a1 = a2 + a1;
		System.out.println(a1);

		byte b4 = 40;
		byte b5 = 30;
		int b6 = b4 * b5;
		System.out.println(b6);

		long w = 30;
		int e = 40;
		long m = w * e;
		System.out.println(m);

		float f1 = 30;
		double d1 = 40;
		double h = f1 * d1;
		System.out.println(h);

		int a11 = 30;
		int a22 = 40;

		a11 = a11 / a22;
		a22 = a11 * a22;
		System.out.println(a11);
		System.out.println(a22);

	}
}
