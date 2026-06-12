package searchingandsorting;

public class KthSmallestMatrix {
	public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (countLessOrEqual(matrix, mid, n) < k)
				lo = mid + 1;
			else
				hi = mid;
		}
		return lo;
	}

	private int countLessOrEqual(int[][] matrix, int mid, int n) {
		int count = 0, row = n - 1, col = 0;
		while (row >= 0 && col < n) {
			if (matrix[row][col] <= mid) {
				count += row + 1;
				col++;
			} else
				row--;
		}
		return count;
	}

	public static void main(String[] args) {
		KthSmallestMatrix sol = new KthSmallestMatrix();
		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		System.out.println(sol.kthSmallest(matrix, 8)); // 13
	}
}
