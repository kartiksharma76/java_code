package array2026;

public class MinArray {
	public static void main(String[] args) {
		int[] arr = { 5, 12, 3, 25, 9 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimun =:" + min);
	}
}
