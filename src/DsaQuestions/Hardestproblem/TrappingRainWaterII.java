package DsaQuestions.Hardestproblem;

import java.util.PriorityQueue;

public class TrappingRainWaterII {
    public static int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        if (m < 3 || heightMap[0].length < 3) {
            return 0;
        }
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>();

        for (int r = 0; r < m; r++) {
            pq.offer(new Cell(r, 0, heightMap[r][0]));
            pq.offer(new Cell(r, n - 1, heightMap[r][n - 1]));

            visited[r][0] = true;
            visited[r][n - 1] = true;
        }
        for (int c = 1; c < n; c++) {
            pq.offer(new Cell(0, c, heightMap[0][c]));
            pq.offer(new Cell(m - 1, c, heightMap[m - 1][c]));

            visited[0][c] = true;
            visited[m - 1][c] = true;
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int water = 0;

        while (!pq.isEmpty()) {
            Cell current = pq.poll();

            for (int[] d : directions) {
                int nr = current.row + d[0];
                int nc = current.col + d[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]) {
                    continue;
                }
                visited[nr][nc] = true;

                int neighborHeight = heightMap[nr][nc];
                if (neighborHeight < current.height) {
                    water += current.height - neighborHeight;
                }
                int effectiveHeight = Math.max(current.height, neighborHeight);
                pq.offer(new Cell(nc, nr, effectiveHeight));
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[][] heightMap = {{1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}};
        System.out.println(trapRainWater(heightMap));
    }

    public static class Cell implements Comparable<Cell> {
        int row, col, height;

        Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }


        @Override
        public int compareTo(Cell other) {
            return Integer.compare(other.height, other.height);
        }
    }
}