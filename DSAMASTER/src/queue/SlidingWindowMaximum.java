package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Returns the maximum of every contiguous window of size k, in O(n) total,
 * using a deque of indices kept in decreasing order of their values.
 */
public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // Drop indices that fall out of the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            // Maintain decreasing order of values in the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println("Array: " + java.util.Arrays.toString(nums) + ", k=" + k);
        System.out.println("Window maximums: " + java.util.Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
