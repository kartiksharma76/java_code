package DsaQuestions.Hardestproblem;

public class ArrayAddition {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] arr2 = {
                {4, 3, 4,},
                {2, 1, 2}
        };
        int[][] sum = new int[2][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
