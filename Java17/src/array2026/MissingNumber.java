package array2026;

public class MissingNumber {

	public static int findMissing(int[] nums) {
		int n = nums.length;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int num : nums) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}

	public static int findMissingXOR(int[] nums) {
		int xor = 0;
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			xor ^= i ^ nums[i];
		}
		return xor ^ n;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 0, 1 };

		System.out.println("Missing (Sum): " + findMissing(nums));
		System.out.println("Missing (XOR): " + findMissingXOR(nums));
	}
}
