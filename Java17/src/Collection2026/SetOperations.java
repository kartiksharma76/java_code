package Collection2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 3, 4));

		Set<Integer> union = new HashSet<>(s1);
		union.addAll(s2);

		// Intersection
		Set<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);

		System.out.println("Union: " + union);
		System.out.println("Intersection: " + intersection);
	}
}
