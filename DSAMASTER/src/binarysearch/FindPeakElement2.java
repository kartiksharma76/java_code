package binarysearch;

public class FindPeakElement2 {

	public static void main(String[] args) {

		int[][] mat = { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } };

		int rows = mat.length;
		int cols = mat[0].length;

		int left = 0;
		int right = cols - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			int maxRow = 0;

			for (int i = 0; i < rows; i++) {
				if (mat[i][mid] > mat[maxRow][mid])
					maxRow = i;
			}

			int leftValue = mid > 0 ? mat[maxRow][mid - 1] : -1;
			int rightValue = mid < cols - 1 ? mat[maxRow][mid + 1] : -1;

			if (mat[maxRow][mid] > leftValue && mat[maxRow][mid] > rightValue) {

				System.out.println("Peak: (" + maxRow + "," + mid + ")");
				return;
			}

			if (leftValue > mat[maxRow][mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
	}
}