package Google.com;

/**
 * function find the minimum number of attempts needed in order to find the
 * critical floor if there is less than or equal to one floor if there is only
 * one egg to store the minimum number of attempts consider all dropping form
 * 1st floor to kth floor
 */
public class EdgeDroppingPuzzle {
	public static int eggDrop(int n, int k) {

		if (k == 1 || k == 0)
			return k;
		if (n == 1)
			return k;

		int res = Integer.MAX_VALUE;

		for (int i = 1; i <= k; i++) {
			int cur = 1 + Math.max(eggDrop(n - 1, i - 1), eggDrop(n, k - i));
			if (cur < res)
				res = cur;
		}
		return res;
	}

	public static void main(String[] args) {
		int n = 2;
		int k = 10;
		System.out.println("Minimum attempts: " + eggDrop(n, k));
	}
}