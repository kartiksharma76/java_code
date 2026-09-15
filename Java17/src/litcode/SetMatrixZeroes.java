package litcode;

import java.util.Arrays;

public class SetMatrixZeroes {

	public void setZeroes(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;

		boolean[] rows = new boolean[m];
		boolean[] cols = new boolean[n];

		// Step 1: mark rows and columns that contain zero
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (matrix[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		// Step 2: set elements to zero
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (rows[i] || cols[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {

		SetMatrixZeroes obj = new SetMatrixZeroes();

		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		obj.setZeroes(matrix);

		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}