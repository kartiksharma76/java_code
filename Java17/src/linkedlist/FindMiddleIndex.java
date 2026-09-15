package linkedlist;

public class FindMiddleIndex {
	int data;
	Node next;

	FindMiddleIndex(int data) {
		this.data = data;
		this.next = next;

	}
}

class linkedlist5 {
	Node head;

	public void insert(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	public int middleNode() {
		Node node = head;
		Node temp = head;

		while (temp != null && temp.next != null) {
			node = node.next;
			temp = temp.next.next;

		}
		return node.data;
	}
}
