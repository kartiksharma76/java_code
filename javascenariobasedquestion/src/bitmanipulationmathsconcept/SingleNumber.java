package bitmanipulationmathsconcept;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int n : nums)
			result ^= n;
		return result;
	}

	public static void main(String[] args) {
		SingleNumber sol = new SingleNumber();
		System.out.println(sol.singleNumber(new int[] { 4, 1, 2, 1, 2 }));
	}
}
