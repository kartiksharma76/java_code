package binarysearch;

public class KthElementOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 6, 7, 9 };
		int[] arr2 = { 1, 4, 8, 10 };

		int k = 5;

		if (arr1.length > arr2.length) {
			int[] temp = arr1;
			arr1 = arr2;
			arr2 = temp;
		}

		int n1 = arr1.length;
		int n2 = arr2.length;

		int low = Math.max(0, k - n2);
		int high = Math.min(k, n1);

		while (low <= high) {

			int cut1 = (low + high) / 2;
			int cut2 = k - cut1;

			int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
			int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];

			int r1 = (cut1 == n1) ? Integer.MAX_VALUE : arr1[cut1];
			int r2 = (cut2 == n2) ? Integer.MAX_VALUE : arr2[cut2];

			if (l1 <= r2 && l2 <= r1) {
				System.out.println("Kth Element: " + Math.max(l1, l2));
				return;
			} else if (l1 > r2) {
				high = cut1 - 1;
			} else {
				low = cut1 + 1;
			}
		}
	}
}
