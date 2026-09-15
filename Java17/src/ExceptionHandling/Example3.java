package ExceptionHandling;

public class Example3 {
	public static int dividebyzero(int a, int b) {

		int i = a / b;
		return i;
	}

	public static int computeDivision(int a, int b) {
		int r = 0;
		try {
			r = dividebyzero(a, b);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException is occured");
		}
		return r;

	}

	public static void main(String[] args) {
		int a = 1;
		int b = 0;

		try {
			int i = computeDivision(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
