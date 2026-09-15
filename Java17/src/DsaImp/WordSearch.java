package DsaImp;

public class WordSearch {
	public static boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (dfs(board, word, i, j, 0)) {
					return true;

				}
			}
		}
		return false;
	}

	private static boolean dfs(char[][] board, String word, int i, int j, int index) {
		if (index == word.length())
			return true;
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
			return false;
		}
		// TODO Auto-generated method stub
		char temp = board[i][j];
		board[i][j] = '#';

		boolean found = dfs(board, word, i + 1, j, index + 1) || dfs(board, word, i - 1, j, index + 1)
				|| dfs(board, word, i, j + 1, index + 1) || dfs(board, word, i, j - 1, index + 1);
		board[i][j] = temp;
		return found;

	}

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		System.out.println(exist(board, "ABCCED"));
		System.out.println(exist(board, "SEE"));
		System.out.println(exist(board, "ABCB"));
	}
}
