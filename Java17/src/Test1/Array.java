package Test1;

public class Array {
	public static void main(String[] args) {
		int arr[][] = { { 1, 3, 5 }, { 7, 8 } };
		for (int[] a : arr) {
			for (int i : a) {
				System.out.println(i + " ");
			}
		}
	}
}
