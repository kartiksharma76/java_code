package javapractice2026;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];

		arr[0][0] = 10;
		arr[1][2] = 20;

		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
	}
}
