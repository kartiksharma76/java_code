package linkedlist;

public class ReverseLinkedList {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null, curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;

	}

	public static void main(String[] args) {
		ReverseLinkedList sol = new ReverseLinkedList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode res = sol.reverseList(head);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		} // 3 2 1
	}
}
