package array;

public class ThreeDimension {
	public static void main(String[] args) {
		int[][][] arr = { { { 1, 2 }, { 3 }, { 4, 5, 6 } }, { { 7 }, { 8, 9, 10 } }, { { 11 }, { 12, 13 } },

		};
		// 1.print all elements
		// 2.print length of 1D,2D,3D
		// 3.print 5,10,13

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}

			}
		}
		// 3
		System.out.println();
		System.out.println(arr[0][2][1]);
		System.out.println(arr[1][1][2]);
		System.out.println(arr[2][1][1]);
	}

}
