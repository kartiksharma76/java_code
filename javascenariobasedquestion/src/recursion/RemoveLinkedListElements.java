package recursion;

public class RemoveLinkedListElements {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		head.next = removeElements(head.next, val);
		return head.val == val ? head.next : head;
	}

	public static void main(String[] args) {
		RemoveLinkedListElements sol = new RemoveLinkedListElements();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		ListNode res = sol.removeElements(head, 6);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
// 1 2 3
	}
}