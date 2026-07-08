package strings;

public class RemoveConsecutiveNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 3, 4, 5, 5 };

		System.out.print("Array after removing consecutive duplicates: ");

		System.out.print(arr[0] + " ");

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1]) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
