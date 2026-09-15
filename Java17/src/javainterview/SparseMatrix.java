package javainterview;

public class SparseMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 0, 0, 3 }, { 0, 0, 0 }, { 4, 0, 0 } };
		int zeroCount = 0;
		int nonZeroCount = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					zeroCount++;
				} else {
					nonZeroCount++;
				}
			}
		}
		if (zeroCount > nonZeroCount) {
			System.out.println("Sprase Matrix");
		} else {
			System.out.println("Not Sprace matrix");
		}
	}
}
