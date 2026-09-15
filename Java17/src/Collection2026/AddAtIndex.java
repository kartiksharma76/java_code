package Collection2026;

import java.util.ArrayList;

public class AddAtIndex {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");

		list.add(1, "X");

		System.out.println(list);
	}
}
