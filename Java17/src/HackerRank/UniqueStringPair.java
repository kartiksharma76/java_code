package HackerRank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class UniqueStringPair {
	static class Pair {
		String first;
		String second;

		Pair(String first, String second) {
			this.first = first;
			this.second = second;

		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Pair pair = (Pair) o;
			return first.equals(pair.first) && second.equals(pair.second);
		}

		@Override
		public int hashCode() {
			return Objects.hash(first, second);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		String[] pairleft = new String[t];
		String[] pairright = new String[t];

		for (int i = 0; i < t; i++) {
			pairleft[i] = s.next();
			pairright[i] = s.next();
		}

		Set<Pair> uniquePair = new HashSet<>();
		for (int i = 0; i < t; i++) {
			Pair p = new Pair(pairleft[i], pairright[i]);
			uniquePair.add(p);
			System.out.println(uniquePair.size());
		}

	}
}
