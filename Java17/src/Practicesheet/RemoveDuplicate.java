package Practicesheet;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

		Set<Integer> set = new HashSet<>();

		for (int x : arr) {
			set.add(x);
		}

		System.out.println(set);
	}
}
