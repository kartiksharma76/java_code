package linkedlist;

public class AlternateNode1 {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			size++;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	/**
	 * Traverses the linked list. Skips every alternate node by updating the next
	 * node of the temp node to point to the node after the next. Moves to the
	 * next valid node.
	 */
	public void deleteAlternateNode() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null && temp.next != null) {
			temp.next = temp.next.next;
			temp = temp.next;
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
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}