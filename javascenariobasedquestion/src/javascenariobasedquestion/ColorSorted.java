package javascenariobasedquestion;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them
 * in-place so that objects of the same color are adjacent, with the colors in
 * the order red, white, and blue.
 */
public class ColorSorted {
	/**
	 * Start Initialize three pointers: low = 0 mid = 0 high = n - 1 Traverse while
	 * mid <= high: If nums[mid] == 0 (Red): Swap nums[low] and nums[mid] Increment
	 * low and mid If nums[mid] == 1 (White): Increment mid If nums[mid] == 2
	 * (Blue): Swap nums[mid] and nums[high] Decrement high Array becomes sorted as
	 * Red → White → Blue. Print/return the array. Stop.
	 */
	public static void sortColors(int[] nums) {

		int low = 0;
		int mid = 0;
		int high = nums.length - 1;

		while (mid <= high) {

			if (nums[mid] == 0) {

				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;

				low++;
				mid++;

			} else if (nums[mid] == 1) {

				mid++;

			} else {

				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;

				high--;
			}
		}
	}

	public static void main(String[] args) {

		int[] nums = { 2, 0, 2, 1, 1, 0 };

		sortColors(nums);

		System.out.print("Sorted Array: [");

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);

			if (i < nums.length - 1)
				System.out.print(", ");
		}

		System.out.println("]");
	}
}
