package DsaQuestions.Meta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {

    public static List<List<Integer>> pacificAtlantic(
            int[][] heights) {

        List<List<Integer>> result = new ArrayList<>();

        if (heights == null || heights.length == 0) {
            return result;
        }

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // Pacific: top row + left column
        for (int col = 0; col < cols; col++) {
            dfs(heights, 0, col, pacific);
        }

        for (int row = 0; row < rows; row++) {
            dfs(heights, row, 0, pacific);
        }

        // Atlantic: bottom row + right column
        for (int col = 0; col < cols; col++) {
            dfs(heights, rows - 1, col, atlantic);
        }

        for (int row = 0; row < rows; row++) {
            dfs(heights, row, cols - 1, atlantic);
        }

        // Cells reachable from both oceans
        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {

                if (pacific[row][col]
                        && atlantic[row][col]) {

                    result.add(
                            Arrays.asList(row, col)
                    );
                }
            }
        }

        return result;
    }

    private static void dfs(
            int[][] heights,
            int row,
            int col,
            boolean[][] visited) {

        if (visited[row][col]) {
            return;
        }

        visited[row][col] = true;

        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        for (int[] dir : directions) {

            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow < 0 || newRow >= heights.length
                    || newCol < 0 || newCol >= heights[0].length) {
                continue;
            }

            // Reverse flow:
            // Move to same or higher height
            if (heights[newRow][newCol]
                    >= heights[row][col]) {

                dfs(
                        heights,
                        newRow,
                        newCol,
                        visited
                );
            }
        }
    }

    public static void main(String[] args) {

        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result =
                pacificAtlantic(heights);

        System.out.println(result);
    }
}