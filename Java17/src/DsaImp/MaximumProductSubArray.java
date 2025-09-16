package DsaImp;
/**

* Find a conigueous subarray of an array with the largest product
* Input: [2, 3, -2, 4] -> Output: 6 (from [2,3])
* Input: [-2, 0, -1] -> Output: 0
* A startup gives growth every month, sometimes +ve, sometimes -ve, sometimes 0
* Which continuous month had the highest overall growth
* Month:[2,3,-2,4] -> Best Month 1-2 -> 2*3 -6
* Do negative in product -> positive
* That's why we have to track both max and min
*/
public class MaximumProductSubArray {
public static int maxProduct(int[]nums) {
	int maxSoFar = nums[0];
	int maxEndingHere = nums[0];
	int minEndingHere= nums[0];
	
	for(int i=1; i<nums.length; i++) {
		int temp = maxEndingHere;
		
		maxEndingHere = Math.max(nums[i], Math.max(maxEndingHere *nums[i], maxEndingHere * nums[i]));
		minEndingHere = Math.min(nums[i], Math.min(nums[i],Math.min(temp* nums[i],minEndingHere * nums[i])));
		
		maxSoFar= Math.max(maxSoFar, maxEndingHere);
	}
	return maxSoFar;
}
public static void main(String[] args) {
	int[]arr= {2,3,-2,4};
	System.out.println("Max Product :" + maxProduct(arr));
	
	int [] arr2 = {-2,0,-1};
	System.out.println("Max Product :"+maxProduct(arr2));
}
}
