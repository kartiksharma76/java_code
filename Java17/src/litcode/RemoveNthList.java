package litcode;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class RemoveNthList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		ListNode fast = dummy, slow = dummy;

		// Move fast pointer n+1 steps ahead
		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}

		// Move both pointers until fast reaches the end
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		// Delete the nth node from end
		slow.next = slow.next.next;

		return dummy.next;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

		int n = 2;
		RemoveNthList sol = new RemoveNthList();
		ListNode result = sol.removeNthFromEnd(head, n);

		// Print the resulting linked list
		System.out.print("After removing " + n + "th node from end: ");
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}
