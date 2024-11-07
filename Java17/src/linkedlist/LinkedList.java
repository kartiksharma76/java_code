package linkedlist;

public class LinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node removeDuplicates(Node head) {
		if (head == null) {
			return null;
		}

		Node current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}

	public static void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create a sample linked list
		Node head = new Node(2);
		head.next = new Node(2);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);

		System.out.print("Original list: ");
		printList(head);

		head = removeDuplicates(head);

		System.out.print("List after removing duplicates: ");
		printList(head);
	}
}
