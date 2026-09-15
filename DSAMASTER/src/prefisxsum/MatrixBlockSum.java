package prefisxsum;

public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length, cols = mat[0].length;
        int[][] prefix = new int[rows + 1][cols + 1];
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                prefix[r + 1][c + 1] = mat[r][c] + prefix[r][c + 1] + prefix[r + 1][c] - prefix[r][c];

        int[][] res = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int r1 = Math.max(0, r - k), c1 = Math.max(0, c - k);
                int r2 = Math.min(rows - 1, r + k), c2 = Math.min(cols - 1, c + k);
                res[r][c] = prefix[r2 + 1][c2 + 1] - prefix[r1][c2 + 1] - prefix[r2 + 1][c1] + prefix[r1][c1];
            }
        }
        return res;
    }
}
