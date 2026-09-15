package Google.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletWithZeroSum {
	public static boolean findTriplet(int[] arr) {

		if (arr == null || arr.length < 3) {
			return false;
		}
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			int left = i + 1;
			int right = arr.length - 1;

			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];

				if (sum == 0) {
					return true;

				} else if (sum < 0) {
					left++;

				} else {
					right--;
				}

			}

		}
		return false;

	}

	public static List<List<Integer>> findTriplets(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();

		if (arr == null || arr.length < 3) {
			return result;

		}
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			// Skip duplicate values for i
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = arr.length - 1;

			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];

				if (sum == 0) {
					result.add(Arrays.asList(arr[i], arr[left], arr[right]));

					while (left < right && arr[left] == arr[left + 1]) {
						left++;

					}
					while (left < right && arr[right] == arr[right - 1]) {
						right--;

					}
					left++;
					right--;
				} else if (sum < 0) {
					left++;

				} else {
					right--;
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { -1, 0, 1, 2, -1, -4 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 0, -1, 2, -3, 1 };

		System.out.println("Array 1 has zero sum triplet: " + findTriplet(arr1));
		System.out.println("Array 2 has zero sum triplet: " + findTriplet(arr2));
		System.out.println("Array 3 has zero sum triplet: " + findTriplet(arr3));

		System.out.println("\nActual triplets in Array 1: " + findTriplets(arr1));
		System.out.println("Actual triplets in Array 3: " + findTriplets(arr3));
	}
}