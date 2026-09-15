package twoDarray;

public class SetMatrixZero {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean firstRow = false;
		boolean firstCol = false;

		// Check first row

		for (int j = 0; j < cols; j++) {
			if (matrix[0][j] == 0) {
				firstRow = true;
				break;
			}
		}

		// Mark rows and columns
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// Set rows to zero
		for (int i = 1; i < rows; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < cols; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Set columns to zero
		for (int j = 1; j < cols; j++) {
			if (matrix[0][j] == 0) {
				for (int i = 1; i < rows; i++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Set first row
		if (firstRow) {
			for (int j = 0; j < cols; j++) {
				matrix[0][j] = 0;
			}
		}

		System.out.println("Matrix after setting zeroes:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
