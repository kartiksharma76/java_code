package array2026;

public class MoveNegative {
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5 };
		int left = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[left];
				arr[left] = arr[i];
				arr[i] = temp;
				left++;
			}
		}

		for (int num : arr)
			System.out.print(num + " ");
	}
}
