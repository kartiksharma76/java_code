package linkedlist;

class Node10 {
	int data;
	Node10 next;

	Node10(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListCycle {

	static boolean hasCycle(Node10 head) {

		if (head == null)
			return false;

		Node10 slow = head;
		Node10 fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {

		Node10 head = new Node10(10);
		head.next = new Node10(20);
		head.next.next = new Node10(30);
		head.next.next.next = new Node10(40);
		head.next.next.next.next = new Node10(50);

		// Create Cycle
		head.next.next.next.next.next = head.next;

		if (hasCycle(head))
			System.out.println("Cycle Detected");
		else
			System.out.println("No Cycle");
	}
}