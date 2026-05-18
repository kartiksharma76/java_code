package javaDsaPattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(10);
		deque.addLast(20);
		deque.addFirst(5);
		System.out.println(deque);
	}
}
