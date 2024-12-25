package linkedlist;

public class CheakConditionOfDoublyLinkdelist1 {
	private Node head;
	private Node tail;
	private int size;
	private int data;

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

	public boolean contain() {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void print() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
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