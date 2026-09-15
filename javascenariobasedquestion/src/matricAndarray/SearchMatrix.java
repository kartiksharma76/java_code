package matricAndarray;

public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length, lo = 0, hi = m * n - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2, val = matrix[mid / n][mid % n];
			if (val == target)
				return true;
			else if (val < target)
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		SearchMatrix sol = new SearchMatrix();
		int[][] m = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		System.out.println(sol.searchMatrix(m, 3)); // true
		System.out.println(sol.searchMatrix(m, 13)); // false
	}
}
