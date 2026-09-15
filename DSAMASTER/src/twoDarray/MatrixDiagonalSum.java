package twoDarray;

public class MatrixDiagonalSum {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int n = matrix.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += matrix[i][i];

			if (i != n - 1 - i) {
				sum += matrix[i][n - 1 - i];
			}
		}
		System.out.println("Diagonal Sum: " + sum);
	}
}
