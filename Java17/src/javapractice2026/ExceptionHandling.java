package javapractice2026;

class AgeException extends Exception {
	public AgeException(String msg) {
		super(msg);
	}
}

public class ExceptionHandling {
	static void checkAge(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("Age is below 18");
		} else {
			System.out.println("You are eligible to vote");
		}
	}

	public static void main(String[] args) {
		// try catch finally

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e);
		} catch (Exception e) {
			System.out.println("General Exception: " + e);
		} finally {
			System.out.println("Finally block always executed");
		}
		try {
			checkAge(15);
		} catch (AgeException e) {
			System.out.println("Custom Exception: " + e.getMessage());
		}
		System.out.println("Program Ended Normally");
	}
}
