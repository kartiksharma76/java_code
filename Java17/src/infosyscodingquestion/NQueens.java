package infosyscodingquestion;

public class NQueens {

	static int N = 4; // Change N for different size

	// Step 1: Function to check if queen placement is safe
	static boolean isSafe(int board[][], int row, int col) {

		// Step 2: Check column above
		for (int i = 0; i < row; i++)
			if (board[i][col] == 1)
				return false;

		// Step 3: Check upper left diagonal
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (board[i][j] == 1)
				return false;

		// Step 4: Check upper right diagonal
		for (int i = row, j = col; i >= 0 && j < N; i--, j++)
			if (board[i][j] == 1)
				return false;

		// Step 5: If no conflict
		return true;
	}

	// Step 6: Recursive function to place queens
	static boolean solveNQ(int board[][], int row) {

		// Step 7: If all queens placed
		if (row == N)
			return true;

		// Step 8: Try placing queen in each column
		for (int col = 0; col < N; col++) {

			// Step 9: Check if safe
			if (isSafe(board, row, col)) {

				// Step 10: Place queen
				board[row][col] = 1;

				// Step 11: Recur for next row
				if (solveNQ(board, row + 1))
					return true;

				// Step 12: Backtrack (remove queen)
				board[row][col] = 0;
			}
		}

		// Step 13: If no column works
		return false;
	}

	public static void main(String[] args) {

		// Step 14: Create board
		int board[][] = new int[N][N];

		// Step 15: Call solve function
		if (solveNQ(board, 0)) {

			System.out.println("Solution Exists:");

			// Step 16: Print solution
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++)
					System.out.print(board[i][j] + " ");
				System.out.println();
			}
		} else {
			System.out.println("No Solution");
		}
	}
}