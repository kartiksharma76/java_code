package DsaQuestions.Amazon;

public class ReverseLinkedList {
    static  class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while( current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }
    public static void printList(ListNode head){
       while (head != null){
           System.out.print(head.val);
           if(head.next != null){
               System.out.print("->");
           }
           head = head.next;
       }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head = reverse(head);
        printList(head);
    }
}
