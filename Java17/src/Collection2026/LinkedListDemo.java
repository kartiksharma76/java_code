package Collection2026;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);

		list.addFirst(5);

		list.add(2, 4);

		list.addAll(list);
		System.out.println(list.addAll(list));
		System.out.println(list);
	}
}
