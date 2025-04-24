package LinkedListProblems;

/*
 * Input: LinkedList : 2->4->6->7->5->1->0
 *  Output: 7
 * Explanation: Count of nodes in the linked list is 7. Hence, the output is 7
 */
public class LengthListNodeCount {
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
			super();
			this.data = data;
			this.next = next;
		}
	}
}