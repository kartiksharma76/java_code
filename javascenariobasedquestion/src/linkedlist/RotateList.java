package linkedlist;

public class RotateList {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || k == 0)
			return head;
		ListNode tail = head;
		int len = 1;
		while (tail.next != null) {
			tail = tail.next;
			len++;
		}
		tail.next = head; // make circular
		int steps = len - k % len;
		ListNode newTail = head;
		for (int i = 1; i < steps; i++)
			newTail = newTail.next;
		ListNode newHead = newTail.next;
		newTail.next = null;
		return newHead;

	}

	public static void main(String[] args) {
		RotateList sol = new RotateList();
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		h.next.next = new ListNode(3);
		h.next.next.next = new ListNode(4);
		h.next.next.next.next = new ListNode(5);
		ListNode res = sol.rotateRight(h, 2);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		} // 4 5 1 2 3
	}
}
