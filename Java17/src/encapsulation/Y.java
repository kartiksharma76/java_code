package ExceptionHandling;

public class Y {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		} catch (RuntimeException ex) {
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.print("D");
		}
		System.out.print("E");
	}

	public static void badMethod() {
		throw new RuntimeException();

	}
}
