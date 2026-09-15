package binarysearch;

public class CountNegativeNumbers {
	public static void main(String[] args) {
		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };

		int count = 0;
		for (int[] row : grid) {

			int left = 0;
			int right = row.length - 1;
			int firstNegative = row.length;

			while (left <= right) {
				int mid = left + (right - left) / 2;

				if (row[mid] < 0) {
					firstNegative = mid;
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			count += row.length - firstNegative;
		}
		System.out.println("Negative Count: " + count);
	}
}
