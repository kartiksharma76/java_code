package array;

public class D2 {
	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 40, 50 }, { 60, 70 }, { 80, 90, 100 }, { 110 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ",");
			}
		}
		System.out.println(arr.length);// 4
		System.out.println(arr);// [[I@7f63425a
		System.out.println(arr[0][0]);// 10
		System.out.println(arr[0][1]);// 20
		System.out.println(arr[0][2]);// 30
		System.out.println(arr[0][3]);// 40
		System.out.println(arr[0][4]);// 50
		System.out.println(arr[1][0]);// 60
		System.out.println(arr[1][1]);// 70
		System.out.println(arr[2][0]);// 80
		System.out.println(arr[2][1]);// 90
		System.out.println(arr[2][2]);// 100
		System.out.println(arr[3][0]);// 110

	}
}
