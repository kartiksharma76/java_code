package Heap;

import java.util.PriorityQueue;

public class MergeKSortedLists {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int v) {
			val = v;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<MergeKSortedLists.ListNode>((a, b) -> a.val - b.val);
		for (ListNode l : lists)
			if (l != null)
				pq.add(l);
		ListNode dummy = new ListNode(0), cur = dummy;
		while (!pq.isEmpty()) {
			cur.next = pq.poll();
			cur = cur.next;
			if (cur.next != null)
				pq.add(cur.next);
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		System.out.println("Merges k sorted lists using min-heap. O(N log k).");
	}
}
