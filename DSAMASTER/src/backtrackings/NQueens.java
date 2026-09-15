package backtrackings;

import java.util.*;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] queenCol = new int[n]; // queenCol[row] = col
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];
        backtrack(0, n, queenCol, cols, diag1, diag2, res);
        return res;
    }
    private void backtrack(int row, int n, int[] queenCol, boolean[] cols, boolean[] diag1, boolean[] diag2, List<List<String>> res) {
        if (row == n) { res.add(buildBoard(queenCol, n)); return; }
        for (int col = 0; col < n; col++) {
            int d1 = row + col, d2 = row - col + n - 1;
            if (cols[col] || diag1[d1] || diag2[d2]) continue;
            cols[col] = diag1[d1] = diag2[d2] = true;
            queenCol[row] = col;
            backtrack(row + 1, n, queenCol, cols, diag1, diag2, res);
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
    private List<String> buildBoard(int[] queenCol, int n) {
        List<String> board = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queenCol[r]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
