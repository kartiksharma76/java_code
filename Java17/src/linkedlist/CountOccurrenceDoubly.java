package linkedlist;

public class CountOccurrenceDoubly {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * append Method: Adds a new node at the end of the doubly linked list.
	 */
	public void append(int data) {
		Node node = new Node(data, null, null);
		if (head == null) {
			head = node;
			tail = node;
			size++;
			return;
		}
		tail.next = node;
		node.previous = tail;
		tail = node;
		size++;
	}

	/**
	 * countOccurrence Method: Iterates through the doubly linked list and counts
	 * occurrences of the given key.
	 */
	public int countOccurrence(int data) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}

	/**
	 * print Method: Prints the elements of the doubly linked list in a single line.
	 */
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * printReverse Method: Prints the elements of the doubly linked list in reverse
	 * order.
	 */
	public void printReverse() {
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.previous;
		}
		System.out.println();
	}

	/**
	 * Returns the size of the doubly linked list.
	 */
	public int size() {
		return size;
	}

	class Node {
		private int data;
		private Node next;
		private Node previous;

		public Node(int data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.previous = prev;
		}
	}

}