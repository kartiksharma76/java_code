package operaters;

public class DivisibilityCheak {
	public boolean isDivisibleBy2(int n) {
		return n % 2 == 0;

	}

	public boolean isDivisibleBy3(int n) {
		return n % 3 == 0;

	}

	public boolean isDivisibleByX(int n, int x) {
		return n % x == 0;

	}

	public static void main(String[] args) {
		DivisibilityCheak divisibility = new DivisibilityCheak();
		boolean result = divisibility.isDivisibleBy2(512);
		System.out.println(result);
		boolean result1 = divisibility.isDivisibleByX(702, 3);
		System.out.println(result1);

	}
}
