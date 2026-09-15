package games;

import java.util.Scanner;

public class TicTacToeAI {
    static char[][] board = new char[3][3];
    static char HUMAN = 'O';
    static char AI = 'X';
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        System.out.println(" Welcome to Tic-Tac-Toe!");
        System.out.println("You are 'O'. AI is 'X'. AI goes first.");

        while (true) {
            // AI's turn
            if (isMovesLeft()) {
                Move bestMove = findBestMove();
                board[bestMove.row][bestMove.col] = AI;
                System.out.println("\n AI plays at: (" + (bestMove.row + 1) + ", " + (bestMove.col + 1) + ")");
                printBoard();
                if (checkWinner(AI)) {
                    System.out.println("X AI wins! Better luck next time.");
                    break;
                }
            }

            // Check for draw after AI move
            if (!isMovesLeft()) {
                System.out.println("It's a draw!");
                break;
            }

            // Human's turn
            humanMove();
            printBoard();
            if (checkWinner(HUMAN)) {
                System.out.println(" You win! (This should never happen if AI is perfect )");
                break;
            }

            // Final draw check
            if (!isMovesLeft()) {
                System.out.println(" It's a draw!");
                break;
            }
        }

        sc.close();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    static void printBoard() {
        System.out.println("\n   1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            if (i < 2) System.out.println("\n  -----------");
        }
        System.out.println();
    }

    static void humanMove() {
        while (true) {
            System.out.print("Enter your move (row and column 1-3): ");
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = HUMAN;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    static boolean checkWinner(char player) {
        // Check rows, columns, diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    static boolean isMovesLeft() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ') return true;
        return false;
    }

    // Minimax algorithm
    static int minimax(char[][] board, int depth, boolean isMax) {
        if (checkWinner(AI)) return 10 - depth;
        if (checkWinner(HUMAN)) return depth - 10;
        if (!isMovesLeft()) return 0;

        if (isMax) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = AI;
                        best = Math.max(best, minimax(board, depth + 1, false));
                        board[i][j] = ' '; // undo move
                    }
                }
            }
            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = HUMAN;
                        best = Math.min(best, minimax(board, depth + 1, true));
                        board[i][j] = ' '; // undo move
                    }
                }
            }
            return best;
        }
    }

    static Move findBestMove() {
        int bestVal = Integer.MIN_VALUE;
        Move bestMove = new Move(-1, -1);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = AI;
                    int moveVal = minimax(board, 0, false);
                    board[i][j] = ' ';

                    if (moveVal > bestVal) {
                        bestMove.row = i;
                        bestMove.col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }

    static class Move {
        int row, col;
        Move(int r, int c) { row = r; col = c; }
    }
}