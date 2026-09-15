package twoDarray;

public class AdditionOfTwoSquareMatrix {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] B = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int n = A.length;
		int[][] sum = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = A[i][j] + B[i][j];
			}
		}

		System.out.println("Sum Matrix:");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
