package DsaQuestions.GoldmanSachs;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
            }
            maxProduct = Math.max(num, maxProduct * num);
            minProduct = Math.min(num, minProduct * num);
            answer = Math.max(answer, maxProduct);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Maximum Product = " + result);
    }

}
