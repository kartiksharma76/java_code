package array;

public class TwodimensionofAayyay {
	public static void main(String[] args) {
		// int []arr= {};
		System.out.println("merzing of array");
		int[][] arr1 = { { 2, 3, 4, 5 }, { 6, 7, 8, 9 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				System.out.println(arr1[i][j]);
			}
		}
		System.out.println("position of array");

		System.out.println(arr1[0][2]);// 4
		System.out.println(arr1[0][0]);// 2
		System.out.println(arr1[0][1]);// 3

		System.out.println("length of array dimension");

		System.out.println(arr1[0].length);// 4
		System.out.println(arr1[1].length);// 4
	}
}
