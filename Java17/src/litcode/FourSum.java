package litcode;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import java.util.*;
/***
 * Enter number of elements: 6 Enter elements: 1 0 -1 0 -2 2 Enter target sum: 0
 * Quadruplets that sum to target: [-2, -1, 1, 2] [-2, 0, 0, 2] [-1, 0, 0, 1]
 * 
 */

public class FourSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter target sum: ");
		int target = sc.nextInt();

		FourSum sol = new FourSum();
		List<List<Integer>> result = sol.fourSum(nums, target); // ✅ proper generic type

		System.out.println("Quadruplets that sum to target:");
		for (List<Integer> list : result) {
			System.out.println(list);
		}

		sc.close();
	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums == null || nums.length < 4)
			return res;

		Arrays.sort(nums);
		int n = nums.length;

		for (int i = 0; i < n - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			for (int j = i + 1; j < n - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;

				int left = j + 1, right = n - 1;
				while (left < right) {
					long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						left++;
						right--;

						while (left < right && nums[left] == nums[left - 1])
							left++;
						while (left < right && nums[right] == nums[right + 1])
							right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return res;
	}
}
