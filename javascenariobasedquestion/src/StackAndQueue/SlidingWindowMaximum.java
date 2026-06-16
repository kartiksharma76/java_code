package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int[] res = new int[n - k + 1];
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			while (!dq.isEmpty() && dq.peekFirst() < i - k + 1)
				dq.pollFirst();
			while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
				dq.pollLast();
			dq.addLast(i);
			if (i >= k - 1)
				res[i - k + 1] = nums[dq.peekFirst()];
		}
		return res;
	}

	public static void main(String[] args) {
		SlidingWindowMaximum sol = new SlidingWindowMaximum();
		int[] res = sol.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3);
		for (int x : res)
			System.out.print(x + " "); // 3 3 5 5 6 7
	}

}
