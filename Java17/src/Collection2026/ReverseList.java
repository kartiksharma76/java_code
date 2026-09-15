package Collection2026;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i) + " ");
		}

	}
}
