package Collection2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4);
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);

	}
}
