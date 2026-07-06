package companywisequestion;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		Deque<Integer> dq = new LinkedList<>();

		for (int i = 0; i < nums.length; i++) {

			while (!dq.isEmpty() && dq.peekFirst() <= i - k) {

				dq.pollFirst();
			}

			while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {

				dq.pollLast();
			}

			dq.offerLast(i);

			if (i >= k - 1) {

				System.out.print(nums[dq.peekFirst()] + " ");
			}
		}
	}
}
