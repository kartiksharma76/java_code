package linkedlist;

public class CountOccurrence {
	private Node head;
	private int size;

	/**
	 * append Method: Added a check to initialize head when the list is empty.
	 * Incremented size only when a new node is added.
	 * 
	 */
	public void append(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		size++;
	}

	/**
	 * countOccurrence Method:
	 * 
	 * Removed the unnecessary creation of a new Node inside the method. Properly
	 * iterated through the list and counted occurrences of the key.
	 * 
	 * 
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
	 * print Method:
	 * 
	 * Added System.out.print instead of System.out.println to print nodes in a
	 * single line with separator.
	 */

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
	}

	/**
	 * Correctly returns the size of the linked list.
	 * 
	 */
	public int size() {
		return size;
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
