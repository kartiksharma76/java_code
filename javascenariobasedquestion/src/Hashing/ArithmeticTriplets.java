package Hashing;

import java.util.HashSet;

public class ArithmeticTriplets {
	public int arthematicTriplets(int[] nums, int diff) {
		HashSet<Integer> set = new HashSet<>();
		for (int n : nums)
			set.add(n);
		int count = 0;
		for (int n : nums)
			if (set.contains(n + diff) && set.contains(n + 2 * diff))
				count++;
		return count;
	}

	public static void main(String[] args) {
		ArithmeticTriplets sol = new ArithmeticTriplets();
		System.out.println(sol.arthematicTriplets(new int[] { 0, 1, 4, 6, 7, 10 }, 3)); // 2
	}
}
