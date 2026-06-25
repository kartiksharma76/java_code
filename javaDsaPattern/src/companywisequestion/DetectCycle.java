package companywisequestion;

//Question:
//Browser history ko Linked List se implement kiya gaya hai.
//Cycle create ho gayi hai. Cycle detect kaise karoge?

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class DetectCycle {
	public static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		// Creating cycle
		head.next.next.next.next = head.next;

		System.out.println("Cycle Present: " + hasCycle(head));
	}
}
