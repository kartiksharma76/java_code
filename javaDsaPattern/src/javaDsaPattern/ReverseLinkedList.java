package javaDsaPattern;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class ReverseLinkedList {
	public static Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
