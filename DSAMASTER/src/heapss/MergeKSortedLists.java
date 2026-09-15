package heapss;

import java.util.*;

public class MergeKSortedLists {
    public static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) if (node != null) minHeap.add(node);
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            cur.next = node;
            cur = cur.next;
            if (node.next != null) minHeap.add(node.next);
        }
        return dummy.next;
    }
}
