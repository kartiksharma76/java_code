package recursion;

public class Recoursion4 {
	public static void printNumber(int n) {
		if (n == 0) {
			return;
		}
		printNumber(n - 1);
		System.out.println(n);
		printNumber(n - 1);

	}

	public static void main(String[] args) {
		printNumber(3);
	}
}
