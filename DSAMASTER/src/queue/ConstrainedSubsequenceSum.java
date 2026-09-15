package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Finds the maximum sum of a non-empty subsequence such that for every two
 * consecutive chosen indices i < j, j - i <= k. dp[i] = best sum of a valid
 * subsequence ending exactly at i. A monotonic deque of indices (decreasing
 * dp values) gives the best usable previous dp value in O(1) amortized.
 */
public class ConstrainedSubsequenceSum {

    public static int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        Deque<Integer> deque = new ArrayDeque<>(); // indices, dp-decreasing
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // Drop indices outside the window [i-k, i-1]
            while (!deque.isEmpty() && deque.peekFirst() < i - k) {
                deque.pollFirst();
            }

            int bestPrev = deque.isEmpty() ? 0 : Math.max(dp[deque.peekFirst()], 0);
            dp[i] = nums[i] + bestPrev;
            answer = Math.max(answer, dp[i]);

            while (!deque.isEmpty() && dp[deque.peekLast()] < dp[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, -10, 5, 20};
        int k = 2;
        System.out.println("Array: " + java.util.Arrays.toString(nums) + ", k=" + k);
        System.out.println("Max constrained subsequence sum: " + constrainedSubsetSum(nums, k));

        int[] nums2 = {-1, -2, -3};
        System.out.println("Array: " + java.util.Arrays.toString(nums2) + ", k=1");
        System.out.println("Max constrained subsequence sum: " + constrainedSubsetSum(nums2, 1));
    }
}
