package litcode;
/**
 * 
 * a ^ a = 0
   a ^ 0 = a
   -------------------
   4 ^ 1 ^ 2 ^ 1 ^ 2
   -------------------
   4 ^ 1 = 5
   5 ^ 2 = 7
   7 ^ 1 = 6
   6 ^ 2 = 4
   -------------------
   1 ^ 1 = 0
   2 ^ 2 = 0
   -------------------
 */
public class SingleNumber {
	public int singleNum(int[] nums) {
		int result = 0;
		for (int num : nums) {
			result ^= num;
		}
		return result;
	}

	public static void main(String[] args) {
		SingleNumber num = new SingleNumber();
		int[] nums = { 4, 1, 2, 1, 2 };
		int resl = num.singleNum(nums);
		System.out.println(resl);
	}
}
