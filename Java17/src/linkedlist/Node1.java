package linkedlist;

public class Node1 {

	int data;
	Node next;

	Node1(int data) {
		this.data = data;
		this.next = null;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		int length = getLength(head);
		System.out.println("Length of the linked list: " + length);
	}

	public static int getLength(Node head) {
		int count = 0;
		Node current = head;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}
}
