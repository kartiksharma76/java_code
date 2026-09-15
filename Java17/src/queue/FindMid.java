package queue;

public class FindMid {
	private Node head;
	private Node tail;
	private int size;

	public void enqueue(int data) {
		enqueue(data);
	}

	public void dequeeu(int data) {
		deqeueFirst();
	}

	public void dequeueLast(int data) {
		dequeuelast(data);
	}

	private void dequeuelast(int data) {
		Node temp = head;
		for (int i = 1; i < size - 1; i++) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}

	public void deqeueFirst() {
		head = head.next;
		size--;

	}

	public void adddata(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;

	}

	public int size() {
		return size;

	}

	public int findmiddleindex() {
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
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}