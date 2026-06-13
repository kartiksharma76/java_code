package matricAndarray;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				int t = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = t;
			}
		// Step 2: Reverse each row
		for (int i = 0; i < n; i++) {
			int l = 0, r = n - 1;
			while (l < r) {
				int t = matrix[i][l];
				matrix[i][l] = matrix[i][r];
				matrix[i][r] = t;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		RotateImage sol = new RotateImage();
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		sol.rotate(m);
		for (int[] row : m) {
			for (int v : row)
				System.out.print(v + " ");
			System.out.println();
		}
//7 4 1 / 8 5 2 / 9 6 3
	}
}
