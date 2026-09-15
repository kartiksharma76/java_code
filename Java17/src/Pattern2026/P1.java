package Pattern2026;

public class P1 {
	public static void main(String[] a) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int s = i; s < n; s++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int s = i; s < n; s++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}