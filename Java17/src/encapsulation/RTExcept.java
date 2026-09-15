package ExceptionHandling;

public class RTExcept {
	public static void throwit() {
		System.out.print("throwit ");
		throw new RuntimeException();

	}

	public static void main(String[] args) {
		try {
			System.out.print("hello ");
			throwit();
		} catch (Exception re) {
			System.out.println("caught");
		} finally {
			System.out.println("finally");
		}
		System.out.println("after");
	}
}
