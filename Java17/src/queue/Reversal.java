package queue;

public class Reversal {
	private Node head;
	private Node tail;
	private int size;

	public void enque(int data) {
		addFirst(data);

	}

	public void addFirst(int data) {
		// TODO Auto-generated method stub
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;
	}

	public int dequeue() {
		return deleteFirst();
	}

	public int deleteFirst() {
		int data = head.data;
		head = head.next;
		size--;
		return data;

	}

	public int size() {
		return size;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

//	public void addmid(int position, int data) {
//		Node node = new Node(data, null);
//		Node temp = head;
//		for (int i = 1; i < position - 1; i++) {
//			temp = temp.next;
//		}
//		node.next = temp.next;
//		temp.next = node;
//		size++;
//	}

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