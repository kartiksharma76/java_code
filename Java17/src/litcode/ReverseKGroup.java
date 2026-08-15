package litcode;

public class ReverseKGroup {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;

		}
	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode groupPrev = dummy;
		ListNode current = head;

		while (true) {
			ListNode kth = getKthNode(current, k);

			if (kth == null) {
				break;
			}
			ListNode nextGroup = kth.next;
			ListNode prev = nextGroup;
			ListNode temp = current;

			while (temp != nextGroup) {
				ListNode next = temp.next;
				temp.next = prev;
				prev = temp;
				temp = next;
			}

			groupPrev.next = kth;

			groupPrev = current;
			current = nextGroup;
		}
		return dummy.next;
	}

	private static ListNode getKthNode(ListNode current, int k) {
		// TODO Auto-generated method stub
		while (current != null && k > 1) {
			current = current.next;
			k--;
		}
		return current;
	}

	private static ListNode createList(int[] values) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		for (int value : values) {
			current.next = new ListNode(value);
			current = current.next;

		}
		return dummy.next;

	}

	private static void printList(ListNode head) {
		while (head != null) {

			System.out.print(head.val);
			if (head.next != null) {
				System.out.print("->");
			}
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 5 };
		int k = 2;
		ListNode head = createList(values);
		System.out.println("Original List:");
		printList(head);

		head = reverseKGroup(head, k);

		System.out.println("Revrsed List: ");
		printList(head);
	}

}
