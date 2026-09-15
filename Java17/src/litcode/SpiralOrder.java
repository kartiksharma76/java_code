package litcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

	public List<Integer> spiralOrder(int[][] matrix) {

		java.util.List<Integer> result = new ArrayList<>();

		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {

			// 1. Left to Right
			for (int j = left; j <= right; j++) {
				result.add(matrix[top][j]);
			}
			top++;

			// 2. Top to Bottom
			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			// 3. Right to Left
			if (top <= bottom) {
				for (int j = right; j >= left; j--) {
					result.add(matrix[bottom][j]);
				}
				bottom--;
			}

			// 4. Bottom to Top
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

		SpiralOrder obj = new SpiralOrder();

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		List<Integer> result = obj.spiralOrder(matrix);

		System.out.println("Spiral Order = " + result);
	}
}