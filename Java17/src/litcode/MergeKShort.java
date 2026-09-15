package litcode;

import java.util.PriorityQueue;

class ListNode1 {
	int val;
	ListNode1 next;

	ListNode1() {
	}

	ListNode1(int val) {
		this.val = val;
	}

	ListNode1(int val, ListNode1 next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeKShort {
	public ListNode1 mergeKLists(ListNode1[] lists) {
		PriorityQueue<ListNode1> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

		for (ListNode1 node : lists) {
			if (node != null)
				pq.offer(node);
		}

		ListNode1 dummy = new ListNode1(0);
		ListNode1 tail = dummy;

		while (!pq.isEmpty()) {
			ListNode1 curr = pq.poll();
			tail.next = curr;
			tail = tail.next;
			if (curr.next != null)
				pq.offer(curr.next);
		}
		return dummy.next;
	}

	// Helper to build a linked list from array
	public static ListNode1 buildList(int[] arr) {
		ListNode1 dummy = new ListNode1(0), curr = dummy;
		for (int val : arr) {
			curr.next = new ListNode1(val);
			curr = curr.next;
		}
		return dummy.next;
	}

	// Helper to print the list
	public static void printList(ListNode1 head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print(" -> ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Example input: [[1,4,5],[1,3,4],[2,6]]
		ListNode1[] lists = new ListNode1[] { buildList(new int[] { 1, 4, 5 }), buildList(new int[] { 1, 3, 4 }),
				buildList(new int[] { 2, 6 }) };

		MergeKShort sol = new MergeKShort();
		ListNode1 merged = sol.mergeKLists(lists);
		System.out.print("Merged list: ");
		printList(merged);
	}
}