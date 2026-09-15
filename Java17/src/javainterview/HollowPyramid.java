package javainterview;

public class HollowPyramid {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i == n || j == 1 || j == 2 * i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
