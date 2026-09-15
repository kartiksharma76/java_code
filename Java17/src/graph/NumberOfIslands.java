package graph;


public class NumberOfIslands {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void dfs(int x, int y, char[][] grid) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != '1')
            return;

        grid[x][y] = '0';
        for (int i = 0; i < 4; i++) dfs(x + dx[i], y + dy[i], grid);
    }

    static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','0','0','1','1'},
            {'0','0','1','0','0'},
            {'1','0','1','1','0'}
        };
        System.out.println(numIslands(grid)); // Output: 4
    }
}

