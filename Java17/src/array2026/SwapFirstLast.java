package array2026;

public class SwapFirstLast {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
