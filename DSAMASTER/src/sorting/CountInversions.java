package sorting;

import java.util.*;

public class CountInversions {

	static int mergeSort(int[] arr, int low, int high) {

		int count = 0;

		if (low < high) {

			int mid = (low + high) / 2;

			count += mergeSort(arr, low, mid);

			count += mergeSort(arr, mid + 1, high);

			count += merge(arr, low, mid, high);
		}

		return count;
	}

	static int merge(int[] arr, int low, int mid, int high) {

		List<Integer> temp = new ArrayList<>();

		int left = low;
		int right = mid + 1;

		int count = 0;

		while (left <= mid && right <= high) {

			if (arr[left] <= arr[right]) {

				temp.add(arr[left]);
				left++;

			} else {

				count += (mid - left + 1);

				temp.add(arr[right]);
				right++;
			}
		}

		while (left <= mid) {
			temp.add(arr[left++]);
		}

		while (right <= high) {
			temp.add(arr[right++]);
		}

		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}

		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 1, 3, 5 };

		System.out.println(mergeSort(arr, 0, arr.length - 1));
	}
}