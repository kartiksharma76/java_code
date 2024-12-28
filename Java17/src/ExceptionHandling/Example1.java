package ExceptionHandling;

public class Example1 {
	int a = 20;

	public int m1() {
		try {
			/**
			 * 1.initial Value of a: a = 20. First Term: a++ Post-increment: The current
			 * value of a (20) is used, and then a is incremented by 1. Value used: 20. a
			 * becomes 21.
			 * 
			 * 3.Second Term: ++a Pre-increment: a is incremented by 1 first, then the new
			 * value is used. a becomes 22. Value used: 22.
			 * 
			 * 4. Third Term: a++ Post-increment: The current value of a (22) is used, and
			 * then a is incremented by 1. Value used: 22. a becomes 23.
			 */
			a = a++ + ++a + a++;// 21+22+23=66
			System.out.println(20 / 0);
			return a;// 66

		} catch (Exception e) {
			System.out.println("in catch");
			++a;// 50

		} finally {
			System.out.println("in finally");
			++a;// 51
			System.out.println(a);
			a = 50;
			System.out.println(a++);
			// return a;//51
		}
		System.out.println(a);
		return a;// 51
	}

	public static void main(String[] args) {
		Example1 e = new Example1();
		System.out.println(e.m1());
	}
}
