package array;

public class ArrTwoDimension2 {
	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(arr);
		System.out.println(arr.length);

		System.out.println();
		int[][] arr1 = { { 34, 23, 24 }, { 67, 56, 56 }, { 46, 45, 13 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");

			}

		}
		System.out.println();// 3

		System.out.println(arr1.length);// 3
		System.out.println(arr1[0].length);// 3
		System.out.println(arr1[1].length);// 3
		System.out.println(arr1[2].length);// 3

		System.out.println(arr1[0][0]);// 34
		System.out.println(arr1[0][1]);// 23
		System.out.println(arr1[0][2]);// 24
		System.out.println(arr1[1][1]);// 56
		System.out.println(arr1[2][0]);// 46
		System.out.println(arr1[2][2]);// 13

	}
}
