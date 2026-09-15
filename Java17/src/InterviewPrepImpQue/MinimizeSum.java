package InterviewPrepImpQue;

import java.util.PriorityQueue;

public class MinimizeSum {
	public static int minSum(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int num : arr) {
			pq.add(num);
		}
		int totalSum = 0;

		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();

			int sum = a + b;
			totalSum += sum;
			pq.add(sum);
		}
		return totalSum;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 7, 10 };
		System.out.println(minSum(arr1));// Output: 39

		int[] arr2 = { 1, 3, 7, 5, 6 };
		System.out.println(minSum(arr2)); // Output: 48
	}
}
