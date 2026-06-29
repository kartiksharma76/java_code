package companywisequestion;

class Node1 {

	int data;
	Node next;

	Node1(int data) {
		this.data = data;
	}
}

public class MiddleNode {
	public static Node middle(Node head) {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		Node ans = middle(head);
		System.out.println("Middle Node = " + ans.data);
	}
}
