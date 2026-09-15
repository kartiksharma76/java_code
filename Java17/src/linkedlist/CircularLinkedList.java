package linkedlist;

public class CircularLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public void add(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
			tail.next = head;
			size++;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
			size++;
		}
	}

	public void print() {
		Node temp = head;
		for (int i = 1; i <= size; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void print2() {
		Node temp = head;
//		System.out.println(temp == head);
//		System.out.println(temp == tail.next);
		while (temp != tail) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

	public boolean isCircularLinkedList() {
		return head == tail.next;
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
