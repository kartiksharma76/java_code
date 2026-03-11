package ExceptionHandling;

public class Test1 {
	public static void aMethod() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		try {
			aMethod();
		} catch (Exception e) {
			System.out.println("Exception ");
		}
		System.out.println("finished");
	}
}
