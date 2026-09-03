package litcode;

public class RemoveDuplicatesFromSortedListII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            // Duplicate found
            if (curr.next != null && curr.val == curr.next.val) {

                int duplicate = curr.val;

                // Skip all nodes having this value
                while (curr != null && curr.val == duplicate) {
                    curr = curr.next;
                }

                prev.next = curr;

            } else {

                // Current node is unique
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        head = deleteDuplicates(head);

        printList(head);
    }
}
