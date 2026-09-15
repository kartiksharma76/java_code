package arrays;

public class RemoveDuplicatesfromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
		int n = arr.length;
		if (n == 0) {
			return;
		}

		int j = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		System.out.println("After removing duplicates:");
		for (int i = 0; i <= j; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
