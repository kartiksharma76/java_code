package array2026;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
