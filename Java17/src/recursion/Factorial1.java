package recursion;

public class Factorial1 {

	static int factorial1(int n) {
		if (n != 0)
			return n * factorial1(n - 1);
		else
			return 1;

	}

	public static void main(String[] args) {
		int number = 20, result;

		result = factorial1(number);
		System.out.println(number + " factorial1=" + result);

	}

}
