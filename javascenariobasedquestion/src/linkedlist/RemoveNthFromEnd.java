package linkedlist;

public class RemoveNthFromEnd {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy, slow = dummy;
		for (int i = 0; i <= n; i++)
			fast = fast.next;
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return dummy.next;

	}

	public static void main(String[] args) {
		RemoveNthFromEnd sol = new RemoveNthFromEnd();
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		h.next.next = new ListNode(3);
		h.next.next.next = new ListNode(4);
		h.next.next.next.next = new ListNode(5);
		ListNode res = sol.removeNthFromEnd(h, 2);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		} // 1 2 3 5
	}
}
