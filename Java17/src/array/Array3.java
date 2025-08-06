package array;

public class Array3 {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("index array:");
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
	}
}