package DsaQuestions.uber;

public class MaximumSubarraySum {
    public static int maxSubArray(int[] nums){
        int currentSum = nums[0];
        int maximumSum = nums[0];

        for (int i = 1; i<nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maximumSum = Math.max(maximumSum, currentSum);
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum = " + result);
    }
}
