package linkedlist;

public class AddMid {
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

	public void addmid(int position, int data) {
		Node node = new Node(data, null, null);
		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}
		node.next = temp;
		node.previous = temp.previous;
		temp.previous.next = node;
		temp.previous = node;
		size++;

	}

	public void print() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

// reverse print
	public void printReverse() {
		Node temp = tail;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.previous;
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
