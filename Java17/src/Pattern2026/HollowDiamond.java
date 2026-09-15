package Pattern2026;

public class HollowDiamond {
	public static void main(String[] args) {
		int n = 4;

		// Upper
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}

		// Lower
		for (int i = n - 1; i >= 1; i--) {

			for (int j = i; j < n; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}
}