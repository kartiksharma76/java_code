package litcode;

class ListNode2 {
	int val;
	ListNode2 next;

	ListNode2(int val) {
		this.val = val;
	}

	ListNode2(int val, ListNode2 next) {
		this.val = val;
		this.next = next;
	}
}

public class SwapNodesInPair {

	public ListNode2 swapPairs(ListNode2 head) {
		if (head == null || head.next == null)
			return head;

		ListNode2 dummy = new ListNode2(0);
		dummy.next = head;
		ListNode2 prev = dummy;

		while (head != null && head.next != null) {
			ListNode2 first = head;
			ListNode2 second = head.next;

			// Swap nodes
			prev.next = second;
			first.next = second.next;
			second.next = first;

			// Move pointers forward
			prev = first;
			head = first.next;
		}
		return dummy.next;
	}

	// Helper to build a linked list from an array
	public static ListNode2 buildList(int[] arr) {
		ListNode2 dummy = new ListNode2(0);
		ListNode2 curr = dummy;
		for (int val : arr) {
			curr.next = new ListNode2(val);
			curr = curr.next;
		}
		return dummy.next;
	}

	// Helper to print a linked list
	public static void printList(ListNode2 head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print(" -> ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		ListNode2 head = buildList(arr);

		SwapNodesInPair sol = new SwapNodesInPair();
		ListNode2 swapped = sol.swapPairs(head);

		System.out.print("Swapped list: ");
		printList(swapped);
	}
}
