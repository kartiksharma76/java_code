package DsaQuestions.Adobe;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    public static int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();

        int fresh = 0;

        // Find rotten and fresh oranges
        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {

                if (grid[row][col] == 2) {
                    queue.offer(new int[]{row, col});
                }

                if (grid[row][col] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // BFS level = 1 minute
        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] current = queue.poll();

                int row = current[0];
                int col = current[1];

                for (int[] direction : directions) {

                    int newRow = row + direction[0];

                    int newCol = col + direction[1];

                    if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) {
                        continue;
                    }

                    if (grid[newRow][newCol] == 1) {

                        grid[newRow][newCol] = 2;

                        fresh--;

                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {

        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        int result = orangesRotting(grid);

        System.out.println("Minutes = " + result);
    }
}