package binarysearch;

public class MatrixMedian {

	public static void main(String[] args) {

		int[][] mat = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };

		int rows = mat.length;
		int cols = mat[0].length;

		int low = 1;
		int high = 2000;

		while (low < high) {

			int mid = low + (high - low) / 2;

			int count = 0;

			for (int[] row : mat) {

				int left = 0;
				int right = cols;

				while (left < right) {

					int m = left + (right - left) / 2;

					if (row[m] <= mid)
						left = m + 1;
					else
						right = m;
				}

				count += left;
			}

			if (count <= (rows * cols) / 2)
				low = mid + 1;
			else
				high = mid;
		}

		System.out.println("Median: " + low);
	}
}