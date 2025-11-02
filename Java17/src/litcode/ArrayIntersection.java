package litcode;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };

		Set<Integer> setA = new HashSet<>();
		for (int x : a)
			setA.add(x);
		Set<Integer> intersection = new HashSet<>();
		for (int x : b)
			if (setA.contains(x))
				intersection.add(x);

		System.out.println("Intersection: " + intersection);
	}
}
