package litcode;

public class ReverseOfValue {
	public static void main(String[] args) {
		int n = 12345;
		int sum = 0;
		int revresed = 0;
		while (n > 0) {
			int rem = n % 10;
			revresed = revresed * 10 + rem;
			n = n / 10;

		}
		System.out.println(revresed);
	}
}
