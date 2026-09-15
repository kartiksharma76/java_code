package linkedlist;

public class Node {
	int data;
	Node next;

	Node(int new_data) {
		data = new_data;
		next = null;
	}

	Node() {
	}

	static Node reverseList(Node head) {
		Node curr = head, prev = null, next;

		while (curr != null) {

			next = curr.next;

			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(" " + node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		System.out.print("Given Linked list:");
		printList(head);

		head = reverseList(head);

		System.out.println("\nReversed Linked List");
		printList(head);
	}
}
