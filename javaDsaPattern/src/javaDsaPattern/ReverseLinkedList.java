package javaDsaPattern;

class Node {
	int data;
	Stack next;

	Node(int data) {
		this.data = data;
	}
}

public class ReverseLinkedList {
	public static Stack reverse(Stack head) {
		Stack prev = null;
		Stack current = head;
		while (current != null) {
			Stack next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
