package DsaQuestions.microsoft;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode mergeKLists(ListNode[]lists){
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));

        for (ListNode node : lists){
            if(node != null){
                minHeap.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!minHeap.isEmpty()){
            ListNode node = minHeap.poll();

            current.next = node;
            current = current.next;

            if(node.next != null){
                minHeap.offer(node.next);
            }
        }
        return  dummy.next;
    }

    public static  void printList(ListNode head){
        while (head != null){
            System.out.print(head.val);

            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = {list1,list2,list3};
        ListNode result = mergeKLists(lists);
        printList(result);
    }
}
