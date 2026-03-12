package litcode;

import java.util.Arrays;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		while (index < nums.length) {
			nums[index++] = 0;
		}
	}

	public static void main(String[] args) {
		MoveZeroes zero = new MoveZeroes();

		int[] nums = { 0, 1, 0, 3, 12 };

		zero.moveZeroes(nums);

		System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
	}
}
