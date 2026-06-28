package companywisequestion;

public class LongestWatchStreak {
	public static void main(String[] args) {
		int[] watch = { 1, 1, 1, 0, 1, 1, 1, 1 };
		int max = 0;
		int count = 0;

		for (int day : watch) {
			if (day == 1) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}
		System.out.println("Longest Streak = " + max);
	}
}
