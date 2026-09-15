package DsaQuestions.Google;

public class NumberOfIslands {
    public static int numIslands(char[][] grid){
        return 0;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result = numIslands(grid);
        System.out.println(result);
    }

}
