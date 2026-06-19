package dynamicprogrammingandgreedy;

public class MaxProductSubarray {
	public int maxProduct(int[] nums) {
		int maxProd = nums[0], minProd = nums[0], result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int tempMax = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
			minProd = Math.min(nums[i], Math.min(maxProd * nums[i], minProd * nums[i]));
			maxProd = tempMax;
			result = Math.max(result, maxProd);
		}
		return result;
	}

	public static void main(String[] args) {
		MaxProductSubarray sol = new MaxProductSubarray();
		System.out.println(sol.maxProduct(new int[] { 2, 3, -2, 4 })); // 6
	}
}