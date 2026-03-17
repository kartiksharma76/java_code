package litcode;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		} else {
			return (n & (n - 1)) == 0;

		}
	}

	public static void main(String[] args) {
		int n = 16;
		if (isPowerOfTwo(n)) {
			System.out.println("Power of Two");
		} else {
			System.out.println("Not power of Two");
		}
	}
}
