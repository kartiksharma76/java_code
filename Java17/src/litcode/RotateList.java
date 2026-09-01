package litcode;

class RotateList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode rotateRight(ListNode head, int k) {

		if (head == null || head.next == null || k == 0) {
			return head;
		}

		// Find the length of the linked list
		int length = 1;
		ListNode tail = head;

		while (tail.next != null) {
			tail = tail.next;
			length++;
		}

		// Reduce unnecessary rotations
		k %= length;

		if (k == 0) {
			return head;
		}

		// Make the list circular
		tail.next = head;

		// Find the new tail
		int stepsToNewTail = length - k;
		ListNode newTail = head;

		for (int i = 1; i < stepsToNewTail; i++) {
			newTail = newTail.next;
		}

		// Node after new tail becomes the new head
		ListNode newHead = newTail.next;

		// Break the circular list
		newTail.next = null;

		return newHead;
	}

	public static ListNode createList(int[] values) {

		if (values == null || values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(values[0]);
		ListNode current = head;

		for (int i = 1; i < values.length; i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
		}

		return head;
	}

	public static void printList(ListNode head) {

		while (head != null) {
			System.out.print(head.val);

			if (head.next != null) {
				System.out.print(" -> ");
			}

			head = head.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5 };
		int k = 2;

		ListNode head = createList(values);

		head = rotateRight(head, k);

		printList(head);
	}
}