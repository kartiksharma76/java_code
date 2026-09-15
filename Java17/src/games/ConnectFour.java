package games;

import java.util.*;

public class ConnectFour {
    static final int ROWS = 6;
    static final int COLS = 7;
    static final char EMPTY = 'B';
    static final char PLAYER = 'R';
    static final char AI = 'Y';

    static char[][] board = new char[ROWS][COLS];
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            initializeBoard();
            System.out.println("🟡 CONNECT FOUR — You are " + PLAYER + ", AI is " + AI);
            printBoard();

            boolean playerTurn = true;

            while (true) {
                if (playerTurn) {
                    if (!playerMove()) {
                        System.out.println("Column full or invalid. Try again.");
                        continue;
                    }
                } else {
                    aiMove();
                    System.out.println("🤖 AI dropped in column " + (getLastMoveCol() + 1));
                }

                printBoard();

                if (checkWin(PLAYER)) {
                    System.out.println("🎉 YOU WIN!");
                    break;
                } else if (checkWin(AI)) {
                    System.out.println("💀 AI WINS!");
                    break;
                } else if (isBoardFull()) {
                    System.out.println("🤝 It's a DRAW!");
                    break;
                }

                playerTurn = !playerTurn;
            }

            System.out.print("\nPlay again? (Y/N): ");
            playAgain = sc.nextLine().equalsIgnoreCase("Y");
        }

        sc.close();
    }

    static void initializeBoard() {
        for (int r = 0; r < ROWS; r++) {
            Arrays.fill(board[r], EMPTY);
        }
    }

    static void printBoard() {
        System.out.println();
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("1 2 3 4 5 6 7");
        System.out.println();
    }

    static boolean playerMove() {
        System.out.print("Choose column (1-7): ");
        int col;
        try {
            col = sc.nextInt() - 1;
            sc.nextLine(); // consume newline
        } catch (Exception e) {
            sc.nextLine();
            return false;
        }

        if (col < 0 || col >= COLS) return false;

        for (int r = ROWS - 1; r >= 0; r--) {
            if (board[r][col] == EMPTY) {
                board[r][col] = PLAYER;
                return true;
            }
        }
        return false; // column full
    }

    static void aiMove() {
        int bestCol = findBestMove();
        for (int r = ROWS - 1; r >= 0; r--) {
            if (board[r][bestCol] == EMPTY) {
                board[r][bestCol] = AI;
                return;
            }
        }
    }

    static int getLastMoveCol() {
        for (int c = 0; c < COLS; c++) {
            for (int r = 0; r < ROWS; r++) {
                if (board[r][c] == AI) {
                    // Check if this was the last move (naive — but works for turn-based)
                    return c;
                }
            }
        }
        return 0;
    }

    static int findBestMove() {
        int bestScore = Integer.MIN_VALUE;
        int bestCol = 0;

        for (int c = 0; c < COLS; c++) {
            if (isColumnValid(c)) {
                int row = dropPiece(c, AI);
                int score = minimax(3, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                board[row][c] = EMPTY;

                if (score > bestScore) {
                    bestScore = score;
                    bestCol = c;
                }
            }
        }
        return bestCol;
    }

    static int minimax(int depth, boolean maximizing, int alpha, int beta) {
        if (checkWin(AI)) return 100;
        if (checkWin(PLAYER)) return -100;
        if (depth == 0 || isBoardFull()) return evaluateBoard();

        if (maximizing) {
            int maxEval = Integer.MIN_VALUE;
            for (int c = 0; c < COLS; c++) {
                if (isColumnValid(c)) {
                    int row = dropPiece(c, AI);
                    int eval = minimax(depth - 1, false, alpha, beta);
                    board[row][c] = EMPTY;
                    maxEval = Math.max(maxEval, eval);
                    alpha = Math.max(alpha, eval);
                    if (beta <= alpha) break;
                }
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for (int c = 0; c < COLS; c++) {
                if (isColumnValid(c)) {
                    int row = dropPiece(c, PLAYER);
                    int eval = minimax(depth - 1, true, alpha, beta);
                    board[row][c] = EMPTY;
                    minEval = Math.min(minEval, eval);
                    beta = Math.min(beta, eval);
                    if (beta <= alpha) break;
                }
            }
            return minEval;
        }
    }

    static int dropPiece(int col, char player) {
        for (int r = ROWS - 1; r >= 0; r--) {
            if (board[r][col] == EMPTY) {
                board[r][col] = player;
                return r;
            }
        }
        return -1;
    }

    static boolean isColumnValid(int col) {
        return board[0][col] == EMPTY;
    }

    static int evaluateBoard() {
        int score = 0;
        // Center column preference
        for (int r = 0; r < ROWS; r++) {
            if (board[r][3] == AI) score += 3;
            if (board[r][3] == PLAYER) score -= 3;
        }
        return score;
    }

    static boolean checkWin(char player) {
        // Horizontal
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c <= COLS - 4; c++) {
                if (board[r][c] == player &&
                    board[r][c+1] == player &&
                    board[r][c+2] == player &&
                    board[r][c+3] == player) return true;
            }
        }
        // Vertical
        for (int c = 0; c < COLS; c++) {
            for (int r = 0; r <= ROWS - 4; r++) {
                if (board[r][c] == player &&
                    board[r+1][c] == player &&
                    board[r+2][c] == player &&
                    board[r+3][c] == player) return true;
            }
        }
        // Diagonal /
        for (int r = 3; r < ROWS; r++) {
            for (int c = 0; c <= COLS - 4; c++) {
                if (board[r][c] == player &&
                    board[r-1][c+1] == player &&
                    board[r-2][c+2] == player &&
                    board[r-3][c+3] == player) return true;
            }
        }
        // Diagonal \
        for (int r = 0; r <= ROWS - 4; r++) {
            for (int c = 0; c <= COLS - 4; c++) {
                if (board[r][c] == player &&
                    board[r+1][c+1] == player &&
                    board[r+2][c+2] == player &&
                    board[r+3][c+3] == player) return true;
            }
        }
        return false;
    }

    static boolean isBoardFull() {
        for (int c = 0; c < COLS; c++) {
            if (board[0][c] == EMPTY) return false;
        }
        return true;
    }
}