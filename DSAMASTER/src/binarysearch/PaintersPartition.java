package binarysearch;

public class PaintersPartition {

	static boolean canPaint(int[] boards, int painters, int limit) {

		int count = 1;
		int total = 0;

		for (int board : boards) {

			if (total + board > limit) {
				count++;
				total = board;
			} else {
				total += board;
			}
		}

		return count <= painters;
	}

	public static void main(String[] args) {

		int[] boards = { 10, 20, 30, 40 };
		int painters = 2;

		int low = 0;
		int high = 0;

		for (int board : boards) {
			low = Math.max(low, board);
			high += board;
		}

		while (low < high) {

			int mid = low + (high - low) / 2;

			if (canPaint(boards, painters, mid))
				high = mid;
			else
				low = mid + 1;
		}

		System.out.println(low);
	}
}