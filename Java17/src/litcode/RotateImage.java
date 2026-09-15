package litcode;

public class RotateImage {
    
    /**
     * Rotates the matrix by 90 degrees clockwise.
     * Approach: Transpose then reverse each row
     * 
     * @param matrix The n x n matrix to rotate
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap rows with columns)
        // Convert rows to columns and vice versa
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;  // FIXED: was assigning to matrix[i][j] again
            }
        }
        
        // Step 2: Reverse each row (left to right)
        // This completes the 90-degree clockwise rotation
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
    
    /**
     * Helper method to print the matrix in a readable format
     * @param matrix The matrix to print
     */
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    
    /**
     * Main method to test the rotate functionality
     */
    public static void main(String[] args) {
        RotateImage solution = new RotateImage();
        
        // Test Case 1: 3x3 matrix
        System.out.println("Test Case 1: 3x3 Matrix");
        System.out.println("========================");
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        solution.printMatrix(matrix1);
        
        solution.rotate(matrix1);
        
        System.out.println("\nAfter 90° Clockwise Rotation:");
        solution.printMatrix(matrix1);
        
        // Expected output:
        // [7, 4, 1]
        // [8, 5, 2]
        // [9, 6, 3]
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        // Test Case 2: 4x4 matrix
        System.out.println("Test Case 2: 4x4 Matrix");
        System.out.println("========================");
        
        int[][] matrix2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        
        System.out.println("Original Matrix:");
        solution.printMatrix(matrix2);
        
        solution.rotate(matrix2);
        
        System.out.println("\nAfter 90° Clockwise Rotation:");
        solution.printMatrix(matrix2);
        
        // Expected output:
        // [15, 13, 2, 5]
        // [14, 3, 4, 1]
        // [12, 6, 8, 9]
        // [16, 7, 10, 11]
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        // Test Case 3: 2x2 matrix
        System.out.println("Test Case 3: 2x2 Matrix");
        System.out.println("========================");
        
        int[][] matrix3 = {
            {1, 2},
            {3, 4}
        };
        
        System.out.println("Original Matrix:");
        solution.printMatrix(matrix3);
        
        solution.rotate(matrix3);
        
        System.out.println("\nAfter 90° Clockwise Rotation:");
        solution.printMatrix(matrix3);
        
        // Expected output:
        // [3, 1]
        // [4, 2]
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        // Test Case 4: 1x1 matrix
        System.out.println("Test Case 4: 1x1 Matrix");
        System.out.println("========================");
        
        int[][] matrix4 = {
            {42}
        };
        
        System.out.println("Original Matrix:");
        solution.printMatrix(matrix4);
        
        solution.rotate(matrix4);
        
        System.out.println("\nAfter 90° Clockwise Rotation:");
        solution.printMatrix(matrix4);
        
        // Expected output: [42] (unchanged)
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("\nStep-by-step explanation of the algorithm:");
        System.out.println("1. First, transpose the matrix (swap rows with columns)");
        System.out.println("2. Then, reverse each row to complete 90° clockwise rotation");
    }
}