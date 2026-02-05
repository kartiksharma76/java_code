package javapractice2026;

public class LogicalDemo {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		System.out.println(a < b && b > 0);
		System.out.println(a > b || b > 0);
		System.out.println(!(a < b));
	}
}
