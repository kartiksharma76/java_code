package ExceptionHandling;

public class Example {
	int a = 10;

	public int m1() {
		try {
			a = a++ + a++ + a++;// 33
			System.out.println(a);
			// System.exit(0);
			System.out.println(10 / 0);
			return a;// 33
		} catch (Exception e) {
			System.out.println("in catch");
			a++;// 34
		} finally {
			System.out.println("in finally");
			a++;// 35
			System.out.println(a);
			a = 40;
			System.out.println(a++);
			// return a;//41
		}
		// System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		Example e = new Example();
		System.out.println(e.m1());// 41
	}
}
