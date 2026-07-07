package arrays;

public class MinAndMaxArray {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 7, 89, 23, 56, 3, 91 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum Element: " + min);
		System.out.println("Maximum Element: " + max);
	}
}
