package linkedlist;

public class Node3 {
	int data;
	int next;

	Node3(int data) {
		this.data = data;
		this.next = next;

	}
}

class LinkedList3 {
	Node head;

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	public int middleNode() {
		Node slowPtr = head;
		Node fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

		}
		return slowPtr.data;
	}
}