package binarysearch;

public class RowWithMaximumOnes {

	static int firstOne(int[] row) {

		int left = 0;
		int right = row.length - 1;
		int ans = row.length;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (row[mid] == 1) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		int[][] mat = { { 0, 0, 0, 1 }, { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 } };

		int maxRow = -1;
		int maxOnes = 0;

		for (int i = 0; i < mat.length; i++) {

			int index = firstOne(mat[i]);
			int ones = mat[i].length - index;

			if (ones > maxOnes) {
				maxOnes = ones;
				maxRow = i;
			}
		}

		System.out.println("Row Index: " + maxRow);
	}
}