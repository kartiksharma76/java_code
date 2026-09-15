package array2026;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesfromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4);

		Set<Integer> set = new LinkedHashSet<>(list);

		System.out.println(set);
	}
}
