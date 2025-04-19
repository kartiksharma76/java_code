package LinkedListProblems;

public class RemoveDuplicate {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;
		} else {
			tail.next = node;
			tail = node;
			size++;
		}
	}

	public void removeduplicate() {
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
	}

	public void print() {
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
