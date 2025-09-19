package DsaImp;

import java.util.Arrays;

/**
* 
* 1. Set Matrix Zeroes
* Problem Statement:
*If a cell has 0, then set its entire row and column to 0.
*In-place - no extra space is required (O(1) space).
*Input:
*2
*3
*[1, 1, 1]
*[1, 0, 1]
*[1, 1, 1]
*
*Output:
*
*1
*2
*3
*[1, 0, 1]
*[0, 0, 0]
*[1, 0, 1]
*Real-Life Example:
*This is the floor plan of an office building — where 0 means “fire alarm triggered”.
*If a fire alarm goes off in a room, the entire floor (row) and entire column (lift shaft) 
*will be evacuated — for safety!
*
*Intuition:
*First we will use row and column 0 as “flag”.
*We will keep an extra flag (col0) — because matrix[0][0] is common for both row and column.
*First traverse the matrix and set the flags.
*Then update the matrix by traversing from bottom to top.
*
*/
public class SetMatrixZeroes {
public static void setZeroes(int[][]matrix) {
	int rows = matrix.length;
	int cols = matrix[0].length;
	boolean col0= false;
	
	for(int i=0;i<rows;i++) {
		if(matrix[i][0]==0)col0 =true;
		
		for(int j=1;j<cols;j++) {
			if(matrix[i][j]==0) {
				matrix[i][0]=0;
				matrix[0][j]=0;
				
			}
		}
	}
	
	for(int i=rows-1;i>=0;i--) {
		for(int j=cols -1;j>=1;j--) {
			if(matrix[i][0]==0 || matrix[0][j]==0) {
				matrix[i][j]=0;
			}
		}
		if (col0) {
			matrix[i][0]=0;
		}
	}

}
public static void printMatrix(int[][]matrix) {
	for(int[]row : matrix) {
		System.out.println(Arrays.toString(row));
	}
}
public static void main(String[] args) {
	int[][]matrix = {
			{1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}	
	};
	System.out.println("Before:");
	printMatrix(matrix);
	
	setZeroes(matrix);
	
	System.out.println("After :");
	printMatrix(matrix);
}
}
