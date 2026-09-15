package RGPV;

public class DoublyLinkedList {
	private Node head;
	private int size;
	private Node tail;

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

	public void addfirst(int data) {
		Node node = new Node(data, null, null);
		node.next = head;
		head.previous = node;
		head = node;
		size++;
	}

	public void addlast(int data) {
		insert(data);
	}

	public int size() {
		return size;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void reverse() {
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
