package linkedlist;

public class ReverseKGroup {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode cur = head;
		int count = 0;
		while (cur != null && count < k) {
			cur = cur.next;
			count++;
		}
		if (count < k)
			return head;
		ListNode prev = null, curr = head;
		for (int i = 0; i < k; i++) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head.next = reverseKGroup(curr, k);
		return prev;
	}

	public static void main(String[] args) {
		ReverseKGroup sol = new ReverseKGroup();
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		h.next.next = new ListNode(3);
		h.next.next.next = new ListNode(4);
		h.next.next.next.next = new ListNode(5);
		ListNode res = sol.reverseKGroup(h, 2);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		} // 2 1 4 3 5

	}

}
