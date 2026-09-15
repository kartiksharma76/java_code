package javainterview;

import java.util.LinkedHashSet;

public class RemoveDupChar {
	public static void main(String[] args) {
		String str = "Programming";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (char e : str.toCharArray()) {
			if (!set.contains(e)) {
				System.out.println(e);
				set.add(e);
			}
		}
	}
}
