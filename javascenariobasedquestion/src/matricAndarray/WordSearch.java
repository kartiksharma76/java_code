package matricAndarray;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		int m = board.length, n = board[0].length;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (dfs(board, word, i, j, 0))
					return true;
		return false;
	}

	private boolean dfs(char[][] b, String w, int i, int j, int k) {
		if (k == w.length())
			return true;
		if (i < 0 || i >= b.length || j < 0 || j >= b[0].length || b[i][j] != w.charAt(k))
			return false;
		char tmp = b[i][j];
		b[i][j] = '#';
		boolean found = dfs(b, w, i + 1, j, k + 1) || dfs(b, w, i - 1, j, k + 1) || dfs(b, w, i, j + 1, k + 1)
				|| dfs(b, w, i, j - 1, k + 1);
		b[i][j] = tmp;
		return found;
	}

	public static void main(String[] args) {
		WordSearch sol = new WordSearch();
		char[][] b = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		System.out.println(sol.exist(b, "ABCCED")); // true
	}
}