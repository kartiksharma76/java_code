package javascenariobasedquestion;

//Given an integer array nums, return an array answer such that answer[i]is 
//equal to the product of all the elements of nums except nums [i]
public class ProductArray {
	/**
	 * 1. Start 2. Create an answer array of same size as nums 3. For each index i:
	 * initialize product = 1 Traverse the array Multiply all elements expect
	 * nums[i] 4.Store product in answer[i] 5. Print/ return the answer array 6.
	 * stop
	 */

	public static int[] productExpectSelf(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			int product = 1;

			for (int j = 0; j < n; j++) {
				if (i != j) {
					product *= nums[j];
				}
			}
			answer[i] = product;
		}
		return answer;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] result = productExpectSelf(nums);
		System.out.print("[");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);

			if (i < result.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
