package linkedlist;

public class ReorderList {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public void reorderList(ListNode head) {
		if (head == null)
			return;
		ListNode slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode second = reverse(slow.next);
		slow.next = null;
		ListNode first = head;
		while (second != null) {
			ListNode t1 = first.next, t2 = second.next;
			first.next = second;
			second.next = t1;
			first = t1;
			second = t2;
		}
	}

	private ListNode reverse(ListNode h) {
		ListNode prev = null, cur = h;
		while (cur != null) {
			ListNode n = cur.next;
			cur.next = prev;
			prev = cur;
			cur = n;
		}
		return prev;
	}

	public static void main(String[] args) {
		ReorderList sol = new ReorderList();
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		h.next.next = new ListNode(3);
		h.next.next.next = new ListNode(4);
		sol.reorderList(h);
		while (h != null) {
			System.out.print(h.val + " ");
			h = h.next;
		} // 1 4 2 3
	}
}
