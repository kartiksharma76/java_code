package Pattern2026;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 5;

		// upper pyramid
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// lower pyramid
		for (int i = n - 1; i >= 1; i--) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}