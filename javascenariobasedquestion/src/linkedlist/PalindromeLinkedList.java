package linkedlist;

public class PalindromeLinkedList {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public boolean isPalindrome(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode rev = reverse(slow);
		ListNode p1 = head, p2 = rev;
		while (p2 != null) {
			if (p1.val != p2.val)
				return false;
			p1 = p1.next;
			p2 = p2.next;
		}
		return true;
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
		PalindromeLinkedList sol = new PalindromeLinkedList();
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		h.next.next = new ListNode(2);
		h.next.next.next = new ListNode(1);
		System.out.println(sol.isPalindrome(h)); // true
	}
}
