package stack;

import java.util.Stack;

public class SubarrayRangeSum {

    public static long subArrayRanges(int[] nums) {

        int n = nums.length;

        long[] leftMin = new long[n];
        long[] rightMin = new long[n];
        long[] leftMax = new long[n];
        long[] rightMax = new long[n];

        Stack<Integer> stack = new Stack<>();

        // Previous Less
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    nums[stack.peek()] > nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                leftMin[i] = i + 1;
            else
                leftMin[i] = i - stack.peek();

            stack.push(i);
        }

        stack.clear();

        // Next Less or Equal
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() &&
                    nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                rightMin[i] = n - i;
            else
                rightMin[i] = stack.peek() - i;

            stack.push(i);
        }

        stack.clear();

        // Previous Greater
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    nums[stack.peek()] < nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                leftMax[i] = i + 1;
            else
                leftMax[i] = i - stack.peek();

            stack.push(i);
        }

        stack.clear();

        // Next Greater or Equal
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() &&
                    nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                rightMax[i] = n - i;
            else
                rightMax[i] = stack.peek() - i;

            stack.push(i);
        }

        long maxSum = 0;
        long minSum = 0;

        for (int i = 0; i < n; i++) {

            maxSum += (long) nums[i] * leftMax[i] * rightMax[i];
            minSum += (long) nums[i] * leftMin[i] * rightMin[i];
        }

        return maxSum - minSum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println(subArrayRanges(nums));
    }
}