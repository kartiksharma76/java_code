package twoDarray;

public class CountNumberOfZeros {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 3 }, { 0, 5, 0 }, { 7, 8, 0 } };

		int count = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println("Number of Zeroes :" + count);

	}
}
