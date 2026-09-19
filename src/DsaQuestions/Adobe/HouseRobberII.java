package DsaQuestions.Adobe;

public class HouseRobberII {
    public static int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        // Case 1: First house included
        //         Last house excluded
        int case1 = robLinear(nums, 0, nums.length - 2);

        // Case 2: First house excluded
        //         Last house included
        int case2 = robLinear(nums, 1, nums.length - 1);

        return Math.max(case1, case2);
    }

    private static int robLinear(int[] nums, int start, int end) {

        int previous2 = 0;
        int previous1 = 0;

        for (int i = start; i <= end; i++) {

            int current = Math.max(previous1, previous2 + nums[i]);

            previous2 = previous1;
            previous1 = current;
        }

        return previous1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 2};

        int result = rob(nums);

        System.out.println("Maximum Money = " + result);
    }
}


