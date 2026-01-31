package array2026;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MatrixProblems {

	// Spiral Traversal
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		if (matrix.length == 0)
			return result;

		int top = 0, bottom = matrix.length - 1;
		int left = 0, right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {

			// Top row
			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;

			// Right column
			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			// Bottom row
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}

			// Left column
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}
		}
		return result;
	}

	// Diagonal Traversal
	public static int[] findDiagonalOrder(int[][] matrix) {
		if (matrix.length == 0)
			return new int[0];

		int m = matrix.length, n = matrix[0].length;
		int[] result = new int[m * n];
		int row = 0, col = 0;
		int direction = 1;

		for (int i = 0; i < m * n; i++) {
			result[i] = matrix[row][col];

			if (direction == 1) {
				if (col == n - 1) {
					row++;
					direction = -1;
				} else if (row == 0) {
					col++;
					direction = -1;
				} else {
					row--;
					col++;
				}
			} else {
				if (row == m - 1) {
					col++;
					direction = 1;
				} else if (col == 0) {
					row++;
					direction = 1;
				} else {
					row++;
					col--;
				}
			}
		}
		return result;
	}

	// MAIN METHOD
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Spiral Order:");
		System.out.println(spiralOrder(matrix));

		System.out.println("Diagonal Order:");
		System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
	}
}
