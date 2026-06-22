package litcodecontest;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class AddTwoSum {
	static ListNode createList(int[] arr) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;

		for (int num : arr) {
			curr.next = new ListNode(num);
			curr = curr.next;
		}
		return dummy.next;
	}

	static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode l1 = createList(new int[] { 2, 4, 3 });
		ListNode l2 = createList(new int[] { 5, 6, 4 });

		printList(l1);
		printList(l2);
	}
}
