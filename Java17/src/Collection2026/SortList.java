package Collection2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1));
		Collections.sort(list);
		System.out.println("Ascending: " + list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Descending: " + list);
	}
}
