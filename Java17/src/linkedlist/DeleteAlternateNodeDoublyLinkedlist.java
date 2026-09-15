package linkedlist;

public class DeleteAlternateNodeDoublyLinkedlist {
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

	public void deleteAlternateNodes() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null && temp.next != null) {
			temp.next = temp.next.next;

			temp = temp.next;
		}

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public int size() {
		return size;

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
