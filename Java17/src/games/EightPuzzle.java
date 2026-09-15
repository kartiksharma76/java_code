package games;

import java.util.*;

public class EightPuzzle {

    static class State {
        int[][] board;
        int x, y;
        String moves;

        State(int[][] board, int x, int y, String moves) {
            this.board = cloneBoard(board);
            this.x = x;
            this.y = y;
            this.moves = moves;
        }

        int[][] cloneBoard(int[][] original) {
            int[][] copy = new int[3][3];
            for (int i = 0; i < 3; i++)
                System.arraycopy(original[i], 0, copy[i], 0, 3);
            return copy;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return Arrays.deepEquals(board, state.board);
        }

        @Override
        public int hashCode() {
            return Arrays.deepHashCode(board);
        }
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[] dir = {'U', 'D', 'L', 'R'};

    static int[][] goal = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 0}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 8-PUZZLE SOLVER USING BFS");
        System.out.println("Enter 3x3 puzzle (use 0 for empty space):");

        int[][] initial = new int[3][3];
        int x0 = 0, y0 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                initial[i][j] = sc.nextInt();
                if (initial[i][j] == 0) {
                    x0 = i;
                    y0 = j;
                }
            }
        }

        if (!isSolvable(initial)) {
            System.out.println(" This puzzle is NOT solvable!");
            sc.close();
            return;
        }

        System.out.println("\nInitial State:");
        printBoard(initial);

        State solution = solve(initial, x0, y0);

        if (solution == null) {
            System.out.println("No solution found.");
        } else {
            System.out.println("\nSolution found in " + solution.moves.length() + " moves!");
            System.out.println("Path: " + solution.moves);

            System.out.println("\nStep-by-step solution (Press ENTER to see each move):");
            replaySolution(initial, x0, y0, solution.moves);
        }

        sc.close();
    }

    static boolean isSolvable(int[][] board) {
        int inversions = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] != 0) arr.add(board[i][j]);

        for (int i = 0; i < arr.size(); i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j)) inversions++;

        return inversions % 2 == 0;
    }

    static State solve(int[][] initial, int x0, int y0) {
        Queue<State> q = new LinkedList<>();
        Set<State> visited = new HashSet<>();

        State start = new State(initial, x0, y0, "");
        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            State current = q.poll();

            if (Arrays.deepEquals(current.board, goal)) {
                return current;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
                    int[][] newBoard = current.cloneBoard(current.board);
                    swap(newBoard, current.x, current.y, nx, ny);

                    State next = new State(newBoard, nx, ny, current.moves + dir[i]);

                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.add(next);
                    }
                }
            }
        }
        return null;
    }

    static void swap(int[][] board, int x1, int y1, int x2, int y2) {
        int temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    static void printBoard(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] == 0 ? " " : board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void replaySolution(int[][] initial, int x, int y, String moves) {
        int[][] board = cloneBoard(initial);
        int cx = x, cy = y;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Start:");
        printBoard(board);

        for (int i = 0; i < moves.length(); i++) {
            System.out.print("\nPress ENTER to see move " + (i + 1) + "...");
            inputScanner.nextLine();

            char move = moves.charAt(i);
            int nx = cx, ny = cy;

            switch (move) {
                case 'U' -> nx--;
                case 'D' -> nx++;
                case 'L' -> ny--;
                case 'R' -> ny++;
            }

            swap(board, cx, cy, nx, ny);
            cx = nx;
            cy = ny;

            System.out.println("\nMove " + (i + 1) + " (" + move + "):");
            printBoard(board);
        }

        System.out.println(" Puzzle Solved! Total moves: " + moves.length());
    }

    static int[][] cloneBoard(int[][] original) {
        int[][] copy = new int[3][3];
        for (int i = 0; i < 3; i++)
            System.arraycopy(original[i], 0, copy[i], 0, 3);
        return copy;
    }
}