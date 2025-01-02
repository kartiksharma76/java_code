package ExceptionHandling;

public class UseThrow {
	public static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("you must be at least 18 year old.");

		} else {
			System.out.println("you are old enough");

		}
	}

	public static void main(String[] args) {
		checkAge(19);
	}
}
