package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ComparisonWithArrayList {
	public static void main(String[] args) {
		// How many ways you can iterate elements from ArrayList

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		// 1. traditional for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// 2. using iterator
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		// 3. Enhance for loop
		for (int element : list) {
			System.out.print(element + " ");
		}

		// 4. ForEach loop
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		// 5. forEach loop
		list.forEach(e -> {
			System.out.print(e + " ");
		});
		// 5. using while loop
		System.out.println();
		int i = 0;
		while (i < list.size()) {
			System.out.print(list.get(i) + " ");
			i++;
		}
	}

}
