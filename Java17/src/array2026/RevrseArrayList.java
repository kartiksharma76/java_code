package array2026;

import java.util.ArrayList;
import java.util.Collections;

public class RevrseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		Collections.reverse(list);
		System.out.println(list);
	}
}
