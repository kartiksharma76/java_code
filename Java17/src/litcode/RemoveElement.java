package litcode;
/**
| i | nums[i] | action           | array     |
| - | ------- | ---------------- | --------- |
| 0 | 3       | skip             | [3,2,2,3] |
| 1 | 2       | store at index 0 | [2,2,2,3] |
| 2 | 2       | store at index 1 | [2,2,2,3] |
| 3 | 3       | skip             |           |
 ---------------------------------------------
 */
public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int result = removeElement(nums, val);
		System.out.println("New Length:" + result);
	}
}
