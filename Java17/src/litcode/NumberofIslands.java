package litcode;

public class NumberofIslands {
    
    /**
     * Counts the number of islands in a 2D grid.
     * An island is surrounded by water and formed by connecting adjacent lands horizontally or vertically.
     * 
     * @param grid 2D grid consisting of '1' (land) and '0' (water)
     * @return Number of islands
     */
    public int numIslands(char[][] grid) {
        // Edge case: empty grid
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int count = 0;

        // Traverse through every cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // If we find a land cell ('1'), it's the start of a new island
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);  // Mark the entire island as visited
                    count++;           // Increment island count
                }
            }
        }
        return count;
    }

    /**
     * Depth-First Search to mark all connected land cells of an island as visited.
     * 
     * @param grid The grid
     * @param i Row index
     * @param j Column index
     */
    private void dfs(char[][] grid, int i, int j) {
        // Check boundaries and if current cell is water or already visited
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;

        // Mark current cell as visited by setting it to '0'
        grid[i][j] = '0';

        // Recursively visit all adjacent cells (up, down, left, right)
        dfs(grid, i + 1, j);  // Down
        dfs(grid, i - 1, j);  // Up
        dfs(grid, i, j + 1);  // Right
        dfs(grid, i, j - 1);  // Left
    }
    
    /**
     * Helper method to print the grid in a readable format
     * @param grid The grid to print
     */
    public void printGrid(char[][] grid) {
        for (char[] row : grid) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print("'" + row[j] + "'");
                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    
    /**
     * Main method to test the Number of Islands functionality
     */
    public static void main(String[] args) {
        NumberofIslands solution = new NumberofIslands();
        
        // Test Case 1: Basic grid with multiple islands
        System.out.println("Test Case 1: Multiple Islands");
        System.out.println("==============================");
        
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        
        System.out.println("Grid:");
        solution.printGrid(grid1);
        
        int result1 = solution.numIslands(grid1);
        System.out.println("\nNumber of islands: " + result1);
        System.out.println("Expected: 1");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test Case 2: Grid with multiple separate islands
        System.out.println("Test Case 2: Multiple Separate Islands");
        System.out.println("=======================================");
        
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        
        System.out.println("Grid:");
        solution.printGrid(grid2);
        
        int result2 = solution.numIslands(grid2);
        System.out.println("\nNumber of islands: " + result2);
        System.out.println("Expected: 3");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test Case 3: Empty grid
        System.out.println("Test Case 3: Empty Grid");
        System.out.println("========================");
        
        char[][] grid3 = {};
        
        System.out.println("Grid: []");
        
        int result3 = solution.numIslands(grid3);
        System.out.println("Number of islands: " + result3);
        System.out.println("Expected: 0");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test Case 4: Grid with no islands (all water)
        System.out.println("Test Case 4: No Islands (All Water)");
        System.out.println("====================================");
        
        char[][] grid4 = {
            {'0', '0', '0', '0'},
            {'0', '0', '0', '0'},
            {'0', '0', '0', '0'}
        };
        
        System.out.println("Grid:");
        solution.printGrid(grid4);
        
        int result4 = solution.numIslands(grid4);
        System.out.println("\nNumber of islands: " + result4);
        System.out.println("Expected: 0");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test Case 5: Single cell grid
        System.out.println("Test Case 5: Single Cell Grid");
        System.out.println("==============================");
        
        char[][] grid5 = {
            {'1'}
        };
        
        System.out.println("Grid:");
        solution.printGrid(grid5);
        
        int result5 = solution.numIslands(grid5);
        System.out.println("\nNumber of islands: " + result5);
        System.out.println("Expected: 1");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test Case 6: Complex grid with diagonal connections (diagonals don't count)
        System.out.println("Test Case 6: Diagonal Connections (Don't Count)");
        System.out.println("================================================");
        
        char[][] grid6 = {
            {'1', '0', '1', '0', '1'},
            {'0', '1', '0', '1', '0'},
            {'1', '0', '1', '0', '1'},
            {'0', '1', '0', '1', '0'}
        };
        
        System.out.println("Grid (diagonal '1's are NOT connected - only horizontal/vertical):");
        solution.printGrid(grid6);
        
        int result6 = solution.numIslands(grid6);
        System.out.println("\nNumber of islands: " + result6);
        System.out.println("Expected: 10 (each '1' is separate island)");
        
        System.out.println("\n" + "=".repeat(50));
        
        // Summary
        System.out.println("\nSUMMARY");
        System.out.println("=======");
        System.out.println("Test Case 1: " + result1 + " island (1x large island)");
        System.out.println("Test Case 2: " + result2 + " islands (3 separate islands)");
        System.out.println("Test Case 3: " + result3 + " islands (empty grid)");
        System.out.println("Test Case 4: " + result4 + " islands (all water)");
        System.out.println("Test Case 5: " + result5 + " island (single cell)");
        System.out.println("Test Case 6: " + result6 + " islands (diagonal pattern)");
        
        System.out.println("\nHow it works:");
        System.out.println("1. Iterate through every cell in the grid");
        System.out.println("2. When '1' is found, increment count and use DFS to mark entire island");
        System.out.println("3. DFS marks connected land cells as '0' to avoid counting them again");
        System.out.println("4. Only horizontal and vertical connections count (not diagonal)");
    }
}