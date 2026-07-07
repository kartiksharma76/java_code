package arrays;

public class IncreasingArray {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 1, 7 };

		long moves = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[i - 1]) {
				moves += (arr[i - 1] - arr[i]);
				arr[i] = arr[i - 1];
			}
		}

		System.out.println("Minimum Moves: " + moves);
		System.out.print("Increasing Array: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
