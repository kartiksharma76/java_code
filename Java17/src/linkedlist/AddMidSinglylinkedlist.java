package linkedlist;

public class AddMidSinglylinkedlist {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head=node;
		size++;
	}

	public void addMid(int position, int data) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
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

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}