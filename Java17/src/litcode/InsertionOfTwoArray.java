package litcode;

import java.util.Arrays;
import java.util.HashSet;

public class InsertionOfTwoArray {
	public int[] insertion(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}
		for (int num : nums2) {
			if (set1.contains(num)) {
				result.add(num);
			}
		}
		int[] arr = new int[result.size()];
		;
		int i = 0;
		for (int num : result) {
			arr[i++] = num;
		}
		return arr;

	}

	public static void main(String[] args) {
		InsertionOfTwoArray obj = new InsertionOfTwoArray();

		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		int[] result = obj.insertion(nums1, nums2);

		System.out.println("Intersection: " + Arrays.toString(result));
	}
}
