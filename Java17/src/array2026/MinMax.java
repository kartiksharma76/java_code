package array2026;

public class MinMax {
	public static void findMinMax(int[] arr) {
		if (arr.length == 0)
			return;

		int min = arr[0];
		int max = arr[0];

		for (int num : arr) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;

		}
		System.out.println("Min :" + min + ", Max :" + max);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 8, 2 };
		findMinMax(arr);
	}
}
