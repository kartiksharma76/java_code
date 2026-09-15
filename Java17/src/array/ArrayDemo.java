package array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0]);//
		System.out.println(arr);//
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
		}
		System.out.println();
		int[][] arr2 = new int[4][];
//System.out.println(arr2[0].length);
		System.out.println(arr2[0]);
	}

}
