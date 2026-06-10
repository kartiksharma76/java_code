package javascenariobasedquestion;

//Given an integer array nums, move all O's to the end of it while maintaining
//the relative order of the non-zero elements. Note that you must do this inplace 
//without making a copy of the array.

public class ZeroMover {
	/**
	 * 
	 * Start Initialize index = 0. Traverse the array. If current element is
	 * non-zero: Place it at nums[index]. Increment index. After traversal, fill
	 * remaining positions with 0. Print the modified array. Stop.
	 * 
	 * @param nums
	 */
	public static void moveZeroes(int[] nums) {
		int index = 0;

		// Move non-zero elements to the front
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}
		// Fill remaining positions with zeros
		while (index < nums.length) {
			nums[index] = 0;
			index++;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);

		System.out.print("Output: [");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);

			if (i < nums.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
