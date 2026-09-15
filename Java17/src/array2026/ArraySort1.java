package array2026;

public class ArraySort1 {
	public static void sortArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				for (int k = 0; k < arr[i].length - 1 - j; k++) {

					if (arr[i][k] > arr[i][k + 1]) {

						int temp = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		int[][] arr = { { 10, 30, 20, 50 }, { 40, 70, 60 } };
		sortArray(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("sort : " + arr[i][j]);
			}
		}
	}
}
