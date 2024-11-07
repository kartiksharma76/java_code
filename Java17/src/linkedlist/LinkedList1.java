package linkedlist;

public class LinkedList1 {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static int lengthOfLinkedList(Node head) {
		int count = 0;
		Node current = head;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args) {

		// Create a sample linked list
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		// Find the length of the linked list
		int length = lengthOfLinkedList(head);

		System.out.println("Length of the linked list: " + length);
	}

}
