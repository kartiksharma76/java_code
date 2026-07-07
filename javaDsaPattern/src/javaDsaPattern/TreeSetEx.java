package javaDsaPattern;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(50);
		tree.add(20);
		tree.add(40);
		tree.add(10);
		tree.add(30);

		System.out.println("Tree: " + tree);

		System.out.println("First: " + tree.first());
		System.out.println("Last: " + tree.last());

		tree.remove(20);

		System.out.println("After Remove: " + tree);

		System.out.println("Contains 30: " + tree.contains(30));

		System.out.println("Size: " + tree.size());

		System.out.println("Is Empty: " + tree.isEmpty());

		tree.clear();

		System.out.println("After Clear: " + tree);
	}
}
