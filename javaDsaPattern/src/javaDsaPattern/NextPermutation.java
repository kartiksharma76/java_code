package javaDsaPattern;

import java.util.Arrays;

public class NextPermutation {
	public static void nextPermutation(int[] nums) {
		int i = nums.length - 2;
		// Find pivot
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}
		// Find successor and swap
		if (i >= 0) {
			int j = nums.length - 1;

			while (nums[j] <= nums[i]) {
				j--;
			}

			swap(nums, i, j);
		}
		// Reverse suffix
		reverse(nums, i + 1, nums.length - 1);
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void reverse(int[] nums, int left, int right) {
		while (left < right) {
			swap(nums, left, right);
			left++;
			right--;
		}
	}

	public static void main(String[] args) {

		// Example 1
		int[] nums1 = { 1, 2, 3 };
		System.out.println("Before: " + Arrays.toString(nums1));
		nextPermutation(nums1);
		System.out.println("After : " + Arrays.toString(nums1));

		// Example 2
		int[] nums2 = { 3, 2, 1 };
		System.out.println("\nBefore: " + Arrays.toString(nums2));
		nextPermutation(nums2);
		System.out.println("After : " + Arrays.toString(nums2));

		// Example 3
		int[] nums3 = { 1, 1, 5 };
		System.out.println("\nBefore: " + Arrays.toString(nums3));
		nextPermutation(nums3);
		System.out.println("After : " + Arrays.toString(nums3));
	}
}
