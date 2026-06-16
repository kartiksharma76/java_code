package bitmanipulationmathsconcept;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i <= nums.length; i++)
			xor ^= i;
		for (int n : nums)
			xor ^= n;
		return xor;
	}

	public static void main(String[] args) {
		MissingNumber sol = new MissingNumber();
		System.out.println(sol.missingNumber(new int[] { 3, 0, 1 }));
	}
}
