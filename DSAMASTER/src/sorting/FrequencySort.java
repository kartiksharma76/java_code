package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {
	static int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

		Arrays.sort(arr, (a, b) -> {
			if (!map.get(a).equals(map.get(b))) {
				return map.get(a) - map.get(b);
			}
			return b - a;
		});
		for (int i = 0; i < nums.length; i++) {
			nums[i] = arr[i];
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 2, 3 };
		frequencySort(nums);

		for (int num : nums)
			System.out.print(num + " ");
	}
}
