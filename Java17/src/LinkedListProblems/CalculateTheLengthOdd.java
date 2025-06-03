package LinkedListProblems;

public class CalculateTheLengthOdd {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = node;

		}
		size++;
	}

	public int size() {
		return size;

	}

//	public boolean isLengthOddByTraversal() {
//		Node temp = head;
//		while (temp != null && temp.next != null) {
//			temp = temp.next.next;
//		}
//		return temp != null; // if fast != null → odd length
//	}

	public boolean countoddlength() {
		return size % 2 == 0;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
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