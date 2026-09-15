package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Finds the length of the longest subarray where max - min <= limit,
 * using two monotonic deques (one tracking window maxima, one minima) plus
 * a sliding window pointer — all in O(n).
 */
public class LongestSubarrayAbsDiffLimit {

    public static int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>(); // decreasing values
        Deque<Integer> minDeque = new ArrayDeque<>(); // increasing values
        int left = 0;
        int best = 0;

        for (int right = 0; right < nums.length; right++) {
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] < nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(right);

            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] > nums[right]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(right);

            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                left++;
                if (maxDeque.peekFirst() < left) maxDeque.pollFirst();
                if (minDeque.peekFirst() < left) minDeque.pollFirst();
            }

            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 7};
        int limit = 4;
        System.out.println("Array: " + java.util.Arrays.toString(nums) + ", limit=" + limit);
        System.out.println("Longest valid subarray length: " + longestSubarray(nums, limit));
    }
}
