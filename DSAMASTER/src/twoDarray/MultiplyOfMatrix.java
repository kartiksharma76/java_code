package twoDarray;

public class MultiplyOfMatrix {
	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] B = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

		int rowsA = A.length;
		int colsA = A[0].length;
		int colsB = B[0].length;

		int[][] result = new int[rowsA][colsB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		System.out.println("Result Matrix:");

		for (int i = 0; i < rowsA; i++) {

			for (int j = 0; j < colsB; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}