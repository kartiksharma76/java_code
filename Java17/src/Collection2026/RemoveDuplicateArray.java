package Collection2026;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4 };
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		System.out.println(set);
	}
}
