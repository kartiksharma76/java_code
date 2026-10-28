package DsaQuestions.Hardestproblem;


public class LongestIncreasingPath {

    static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int rows, cols;
    static int[][] memo;

    public static int longestIncreasingPath(int[][] matrix) {
        rows = matrix.length;
        cols = matrix[0].length;

        memo = new int[rows][cols];

        int answer = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                answer = Math.max(answer, dfs(matrix, r, c));
            }
        }

        return answer;
    }

    static int dfs(int[][] matrix, int r, int c) {
        if (memo[r][c] != 0) {
            return memo[r][c];
        }

        int longest = 1;

        for (int[] d : DIRS) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) {
                continue;
            }

            if (matrix[nr][nc] > matrix[r][c]) {
                longest = Math.max(longest, 1 + dfs(matrix, nr, nc));
            }
        }

        memo[r][c] = longest;
        return longest;
    }

    public static void main(String[] args) {
        int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};

        System.out.println(longestIncreasingPath(matrix));
        // Output: 4
    }
}
