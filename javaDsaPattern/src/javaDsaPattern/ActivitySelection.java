package javaDsaPattern;

public class ActivitySelection {
	public static void main(String[] args) {
		int[] start = { 1, 3, 0, 5, 8, 5 };
		int[] end = { 2, 4, 6, 7, 9, 9 };
		int count = 1;
		int prev = 0;
		for (int i = 1; i < end.length; i++) {
			if (start[i] >= end[prev]) {
				count++;
				prev = i;
			}
		}
		System.out.println(count);
	}
}
