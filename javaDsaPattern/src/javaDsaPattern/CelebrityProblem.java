package javaDsaPattern;

public class CelebrityProblem {
	public static int findCelebrity(int[][] matrix, int n) {
		int candidate = 0;
		for (int i = 1; i < n; i++) {
			if (matrix[candidate][i] == 1) {
				candidate = i;
			}
		}
		for (int i = 0; i < n; i++) {
			if (i != candidate && (matrix[candidate][i] == 1 || matrix[i][candidate] == 0)) {
				return -1;
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1 }, { 0, 0, 0 }, { 0, 1, 0 } };

		int ans = findCelebrity(matrix, 3);

		System.out.println("Celebrity Index = " + ans);
	}
}
