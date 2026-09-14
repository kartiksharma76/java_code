package DsaQuestions.Amazon;

public class RowWithMaximumOnes {
    public static int findRow(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        int answer = -1;

        while(row < rows && col >= 0){
            if(matrix[row][col] == 1){
                answer = row;
                col--;
            }else{
                row++;
            }
        }
        return  answer;

    }

    public static void main(String[] args) {
        int[][]matrix = {{0,0,0,1},{0,0,1,1},{0,1,1,1},{0,0,0,0}};
        System.out.print(findRow(matrix));
    }
}
