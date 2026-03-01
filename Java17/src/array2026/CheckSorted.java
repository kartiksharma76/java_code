package array2026;

public class CheckSorted {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 15, 20 };

		boolean sorted = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				sorted = false;
				break;
			}
		}
		if (sorted) {
			System.out.println("Array is Sorted");
		} else {
			System.out.println("Array is NOT Sorted");
		}
	}
}
