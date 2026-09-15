package LinkedListProblems;

public class CountOfListNode {
	private Node head;
	private Node tail;
	private int length;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
			length++;
		} else {
			tail.next = node;
			tail = node;
			length++;

		}
	}

	public int length() {
		return length;

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
			this.data = data;
			this.next = next;
		}
	}
}