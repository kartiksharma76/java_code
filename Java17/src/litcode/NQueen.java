package litcode;

public class NQueen {

	int count = 0;

	public int totalNQueens(int n) {

		char[][] board = new char[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				board[i][j] = '.';
			}
		}

		solve(0, n, board);

		return count;
	}

	private void solve(int row, int n, char[][] board) {

		if (row == n) {

			count++;

			return;
		}

		for (int col = 0; col < n; col++) {

			if (isSafe(row, col, n, board)) {

				board[row][col] = 'Q';

				solve(row + 1, n, board);

				board[row][col] = '.';
			}
		}
	}

	private boolean isSafe(int row, int col, int n, char[][] board) {

		// Check column
		for (int i = 0; i < row; i++) {

			if (board[i][col] == 'Q') {

				return false;
			}
		}

		// Check upper-left diagonal
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

			if (board[i][j] == 'Q') {

				return false;
			}
		}

		// Check upper-right diagonal
		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {

			if (board[i][j] == 'Q') {

				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		NQueen obj = new NQueen();

		int n = 4;

		int result = obj.totalNQueens(n);

		System.out.println("N = " + n);
		System.out.println("Total Solutions = " + result);
	}
}