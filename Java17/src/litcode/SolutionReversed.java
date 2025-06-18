package litcode;

public class SolutionReversed {
	public static void main(String[] args) {
		int x = 123;
		System.out.println(reversedNumber(x));
	}

	public static int reversedNumber(int x) {
		int reversed = 0;
		while (x != 0) {
			int remainder = x % 10;
			if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
				System.out.println("overflow");
				return 0;
			}
			reversed = reversed * 10 + remainder;
			x = x / 10;
		}
		return reversed;
	}
}
