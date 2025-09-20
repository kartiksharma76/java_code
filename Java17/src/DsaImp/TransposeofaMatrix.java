package DsaImp;

import java.util.Arrays;

public class TransposeofaMatrix {
	public static int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] result = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[j][i] = matrix[i][j];
			}
		}
		return result;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println("original :");
		printMatrix(matrix);
		int[][] transpose = transpose(matrix);
		System.out.println("Transposed :");
		printMatrix(transpose);
	}
}
