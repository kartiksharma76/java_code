package array2026;

import java.util.HashSet;

public class FindUnionofTwoSets {
	public static void main(String[] args) {

		HashSet<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(2);

		HashSet<Integer> s2 = new HashSet<>();
		s2.add(2);
		s2.add(3);

		s1.addAll(s2);

		System.out.println(s1);
	}
}
