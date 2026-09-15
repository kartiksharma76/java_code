package Pattern2026;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			// left increasing
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.print("     ");

			// right decreasing
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
