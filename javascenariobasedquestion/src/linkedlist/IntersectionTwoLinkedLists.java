package linkedlist;

public class IntersectionTwoLinkedLists {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode a = headA, b = headB;
		while (a != b) {
			a = (a == null) ? headB : a.next;
			b = (b == null) ? headA : b.next;
		}
		return a;

	}

	public static void main(String[] args) {
		System.out.println("Intersection node finder — O(m+n) time, O(1) space.");

	}
}
