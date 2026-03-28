package Collection2026;

import java.util.HashSet;

public class UniqueSet {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(10);
		set.add(20);

		System.out.println(set);
	}
}
