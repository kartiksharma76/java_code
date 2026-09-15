package binarysearch;

public class ValidPerfectSquare {
	public static void main(String[] args) {
		int num = 49;
		int left = 1;
		int right = num;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			long square = (long) mid * mid;

			if (square == num) {
				System.out.println(true);
				return;
			}

			if (square < num)
				left = mid + 1;
			else
				right = mid - 1;
		}
		System.out.println(false);
	}
}
