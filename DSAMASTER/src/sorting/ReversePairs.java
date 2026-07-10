package sorting;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
	public static int reversePairs(int[] nums) {
		return mergeSort(nums, 0, nums.length - 1);
	}

	static int mergeSort(int[] arr, int low, int high) {

		if (low >= high)
			return 0;

		int mid = low + (high - low) / 2;

		int count = 0;

		count += mergeSort(arr, low, mid);
		count += mergeSort(arr, mid + 1, high);

		count += countPairs(arr, low, mid, high);

		merge(arr, low, mid, high);

		return count;
	} 

	static int countPairs(int[] arr, int low, int mid, int high) {

		int count = 0;
		int right = mid + 1;

		for (int left = low; left <= mid; left++) {

			while (right <= high && arr[left] > 2L * arr[right]) {
				right++;
			}

			count += (right - (mid + 1));
		}

		return count;
	}

	static void merge(int[] arr, int low, int mid, int high) {

		List<Integer> temp = new ArrayList<>();

		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {

			if (arr[left] <= arr[right]) {
				temp.add(arr[left++]);
			} else {
				temp.add(arr[right++]);
			}
		}

		while (left <= mid)
			temp.add(arr[left++]);

		while (right <= high)
			temp.add(arr[right++]);

		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 3, 1 };

		System.out.println(reversePairs(nums));
	}
}
