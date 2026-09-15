package linkedlist;

public class FindMiddleNodeInDoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;

		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
			size++;
		}
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

	public void print() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	class Node {
		private int data;
		private Node next;
		private Node previous;

		public Node(int data, Node next, Node previous) {
			super();
			this.data = data;
			this.next = next;
			this.previous = previous;
		}
	}
}