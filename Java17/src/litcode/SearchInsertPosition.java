package litcode;
/**
| i | nums[i] | condition        |
| - | ------- | ---------------- |
| 0 | 1       | 1 < 2            |
| 1 | 3       | 3 ≥ 2 → return 1 |
----------------------------------
 */
public class SearchInsertPosition {
	public static int seartchInsertPosition(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		int result = seartchInsertPosition(nums, target);
		System.out.println("position " + result);
	}
}
