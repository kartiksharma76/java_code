package graph;

public class SurroundedRegions {
    public void solve(char[][] board) {
        int rows = board.length, cols = board[0].length;
        for (int r = 0; r < rows; r++) {
            markSafe(board, r, 0);
            markSafe(board, r, cols - 1);
        }
        for (int c = 0; c < cols; c++) {
            markSafe(board, 0, c);
            markSafe(board, rows - 1, c);
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'O') board[r][c] = 'X';
                else if (board[r][c] == '#') board[r][c] = 'O';
            }
        }
    }
    private void markSafe(char[][] board, int r, int c) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != 'O') return;
        board[r][c] = '#';
        markSafe(board, r + 1, c); markSafe(board, r - 1, c);
        markSafe(board, r, c + 1); markSafe(board, r, c - 1);
    }
}
