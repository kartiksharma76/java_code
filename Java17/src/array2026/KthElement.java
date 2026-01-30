package array2026;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthElement {

	public static int KthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}

	public static int KthLargest(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int num : arr) {
			minHeap.offer(num);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		return minHeap.peek();
	}

	public static int KthSmallestQuickSelect(int[] arr, int k) {
		return quickSelect(arr, 0, arr.length - 1, k - 1);
	}

	private static int quickSelect(int[] arr, int left, int right, int k) {
		if (left <= right) {
			int pivotIndex = partition(arr, left, right);
			if (pivotIndex == k) {
				return arr[pivotIndex];
			} else if (pivotIndex > k) {
				return quickSelect(arr, left, pivotIndex - 1, k);
			} else {
				return quickSelect(arr, pivotIndex + 1, right, k);
			}
		}
		return -1;
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left;

		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, right);
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;

		System.out.println("Array: " + Arrays.toString(arr));

		System.out.println("Kth Smallest (Sort): " + KthSmallest(arr.clone(), k));
		System.out.println("Kth Largest (Heap): " + KthLargest(arr.clone(), k));
		System.out.println("Kth Smallest (QuickSelect): " + KthSmallestQuickSelect(arr.clone(), k));
	}
}
