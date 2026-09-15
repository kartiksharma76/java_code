package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementCircular {

    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(ans, -1);

        // Traverse twice because array is circular
        for (int i = 2 * n - 1; i >= 0; i--) {

            int current = nums[i % n];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            if (i < n) {
                if (!stack.isEmpty()) {
                    ans[i] = stack.peek();
                }
            }

            stack.push(current);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[] result = nextGreaterElements(nums);

        System.out.println(Arrays.toString(result));
    }
}