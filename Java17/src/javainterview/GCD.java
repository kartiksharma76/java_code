package javainterview;

public class GCD {
	public static void main(String[] args) {
		int a = 12, b = 18;
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		System.out.println(a);
	}
}
