package array2026;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 8, 40, 15 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		System.out.println("Second Largest = " + second);
	}
}
