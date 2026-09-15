package twoDarray;

public class CountNegativeNumberInMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, -2, 3 }, { -4, 5, -6 }, { 7, -8, 9 } };

		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Number of Negative Elements:" + count);
	}
}
