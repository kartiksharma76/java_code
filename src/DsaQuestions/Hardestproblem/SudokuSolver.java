package DsaQuestions.Hardestproblem;

public class SudokuSolver {
    static int[] rowMask = new int[9];
    static int[] colMask = new int[9];
    static int[] boxMask = new int[9];

    static int box(int r, int c) {
        return (r / 3) * 3 + c / 3;

    }

    public static void solvedSudoku(char[][] board) {
        rowMask = new int[9];
        colMask = new int[9];
        boxMask = new int[9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    int bit = 1 << (board[r][c] - '1');
                    rowMask[r] |= bit;
                    colMask[c] |= bit;
                    boxMask[box(r, c)] |= bit;
                }
            }
        }
        solve(board);
    }

    static boolean solve(char[][] board) {
        int bestR = -1, bestC = -1;
        int bestCandidates = 10;

        // Minimum Remaining Values heuristic
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') continue;

                int used = rowMask[r] | colMask[c]
                        | boxMask[box(r, c)];

                int candidates = 9 - Integer.bitCount(used);

                if (candidates < bestCandidates) {
                    bestCandidates = candidates;
                    bestR = r;
                    bestC = c;
                }
            }
        }
        if (bestR == -1) return true;
        if (bestCandidates == 0) return false;
        int r = bestR, c = bestC, b = box(r, c);
        int used = rowMask[r] | colMask[c] | boxMask[b];

        for (int digit = 1; digit <= 9; digit++) {
            int bit = 1 << (digit - 1);

            if ((used & bit) != 0) continue;

            board[r][c] = (char) ('0' + digit);
            rowMask[r] |= bit;
            colMask[c] |= bit;
            boxMask[b] |= bit;

            if (solve(board)) return true;

            board[r][c] = '.';
            rowMask[r] ^= bit;
            colMask[c] ^= bit;
            boxMask[b] ^= bit;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                "53..7....".toCharArray(),
                "6..195...".toCharArray(),
                ".98....6.".toCharArray(),
                "8...6...3".toCharArray(),
                "4..8.3..1".toCharArray(),
                "7...2...6".toCharArray(),
                ".6....28.".toCharArray(),
                "...419..5".toCharArray(),
                "....8..79".toCharArray()
        };
        solvedSudoku(board);
        for (char[] row : board) {
            System.out.println(new String(row));
        }
    }
}


