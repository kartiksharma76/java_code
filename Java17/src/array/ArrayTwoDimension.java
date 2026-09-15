package array;

public class ArrayTwoDimension {
	public static void main(String[] args) {
		// int arr = new int [];//C.E compilation error
		int[] arr = {};
		System.out.println(arr);
		System.out.println(arr.length);

		System.out.println();
		int[][] arr2 = { { 10, 20, 30 }, { 40, 50 }, { 1, 2, 3 }, { 6 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println(arr2.length);// 6
		System.out.println(arr2[0].length);// 3
		System.out.println(arr2[1].length);// 2
		System.out.println(arr2[2].length);// 3
		System.out.println(arr2[3].length);// 1

		System.out.println(arr2[2][1]);// 2
		System.out.println(arr2[3][0]);// 6
		System.out.println(arr2[1][1]);// 50

	}
}