package Practicesheet;

/**
 *  Array Programs
1. Java Program For Linear Search
2. Java Program For Binary Search
3. Java Program to Find the Largest Element in an Array
4. Java Program to Sort an Array
5. Java Program to Merge Two Arrays
6. Java Program to Copy All the Elements of One Array to Another Array
7. Java Program to Print a 2D Array
8. Java Program to Add Two Matrices
9. Java Program to Find the Transpose
10. Java Program to Print Boundary Elements of a Matrix
 */
import java.util.*;

public class ArrayProgramme {

	public static void main(String[] args) {

		// Sample 1D array
		int[] arr = { 10, 20, 30, 40, 50 };

		// 1. Linear Search
		int key = 30;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Linear Search: Found at index " + i);
				break;
			}
		}

		// 2. Binary Search (array must be sorted)
		int index = Arrays.binarySearch(arr, 40);
		System.out.println("Binary Search index: " + index);

		// 3. Largest element in array
		int max = arr[0];
		for (int i : arr) {
			if (i > max)
				max = i;
		}
		System.out.println("Largest Element: " + max);

		// 4. Sort an array
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		// 5. Merge two arrays
		int[] arr2 = { 60, 70 };
		int[] merged = new int[arr.length + arr2.length];

		System.arraycopy(arr, 0, merged, 0, arr.length);
		System.arraycopy(arr2, 0, merged, arr.length, arr2.length);
		System.out.println("Merged Array: " + Arrays.toString(merged));

		// 6. Copy array
		int[] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);
		System.out.println("Copied Array: " + Arrays.toString(copy));

		// 7. Print 2D array
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("2D Array:");
		for (int[] row : matrix) {
			for (int val : row)
				System.out.print(val + " ");
			System.out.println();
		}

		// 8. Add two matrices
		int[][] m1 = { { 1, 2 }, { 3, 4 } };
		int[][] m2 = { { 5, 6 }, { 7, 8 } };
		int[][] sum = new int[2][2];

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				sum[i][j] = m1[i][j] + m2[i][j];

		System.out.println("Matrix Addition:");
		for (int[] row : sum) {
			for (int val : row)
				System.out.print(val + " ");
			System.out.println();
		}

		// 9. Transpose of a matrix
		System.out.println("Transpose:");
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[j][i] + " ");
			System.out.println();
		}

		// 10. Boundary elements of matrix
		System.out.println("Boundary Elements:");
		int r = matrix.length;
		int c = matrix[0].length;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == 0 || j == 0 || i == r - 1 || j == c - 1)
					System.out.print(matrix[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
