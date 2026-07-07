package arrays;

public class NextPermutation {

	// Reverse the array from start to end
	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

		int n = arr.length;
		int index = -1;

		// Step 1: Find the first decreasing element from the end
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				index = i;
				break;
			}
		}

		// If no such element exists, reverse the whole array
		if (index == -1) {
			reverse(arr, 0, n - 1);
		} else {

			// Step 2: Find the next greater element
			for (int i = n - 1; i > index; i--) {
				if (arr[i] > arr[index]) {
					int temp = arr[i];
					arr[i] = arr[index];
					arr[index] = temp;
					break;
				}
			}

			// Step 3: Reverse the remaining part
			reverse(arr, index + 1, n - 1);
		}

		System.out.print("Next Permutation: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}