package array2026;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < n - 1; k++) {
						arr[k] = arr[k + 1];
					}
					n--;
					j--;
				}
			}
		}
		for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}
}
