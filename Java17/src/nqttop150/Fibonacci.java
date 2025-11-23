package nqttop150;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 7, a = 0, b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;
		}
	}
}
