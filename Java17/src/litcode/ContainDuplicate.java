package litcode;

import java.util.HashSet;

public class ContainDuplicate {
	public boolean containDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}

	public static void main(String[] args) {
		ContainDuplicate dup = new ContainDuplicate();
		int[] arr = { 1, 2, 3, 1 };
		boolean result = dup.containDuplicate(arr);
		System.out.println(result);
	}
}
