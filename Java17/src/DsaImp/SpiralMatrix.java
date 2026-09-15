package DsaImp;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	/**
	 * A scanner is a machine that scans the document starting from the center and
	 * in a spiral — like the film roll used to rotate in old film cameras!
	 * 
	 * Or — a farmer in a field is harvesting crops in a spiral — from outside to
	 * inside.
	 * 
	 * Intuition: Define 4 boundaries:
	 * 
	 * top, bottom, left, right Then in clockwise direction:
	 * 
	 * Top row -> left to right Right col -> top to bottom Bottom row → right to
	 * left Left col -> bottom to top Shrink the boundary after every step.
	 */
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		if (matrix.length == 0)
			return result;

		int top = 0, bottom = matrix.length - 1;
		int left = 0, right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {

			for (int j = left; j <= right; j++) {
				result.add(matrix[top][j]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom) {

				for (int j = right; j >= left; j--) {
					result.add(matrix[bottom][j]);
				}
				bottom--;
			}

			if (left <= right) {

				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(spiralOrder(matrix));

	}
}
