package array2026;

public class MaxArray {
	public static void main(String[] args) {
		int[] arr = { 5, 12, 3, 25, 9 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum =" + max);
	}
}
