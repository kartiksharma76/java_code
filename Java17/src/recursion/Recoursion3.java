package recursion;

public class Recoursion3 {
	public static void printNumber(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNumber(n - 1);

	}

	public static void main(String[] args) {
		printNumber(3);
	}
}
