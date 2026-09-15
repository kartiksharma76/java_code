package linkedlist;

class Node15 {
    int data;
    Node15 next;

    Node15(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveNthFromEnd {

    static Node15 removeNth(Node15 head, int n) {

        Node15 dummy = new Node15(0);
        dummy.next = head;

        Node15 fast = dummy;
        Node15 slow = dummy;

        // Move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    static void display(Node15 head) {

        Node15 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node15 head = new Node15(10);
        head.next = new Node15(20);
        head.next.next = new Node15(30);
        head.next.next.next = new Node15(40);
        head.next.next.next.next = new Node15(50);

        System.out.println("Original Linked List:");
        display(head);

        head = removeNth(head, 2);

        System.out.println("After Removing 2nd Node From End:");
        display(head);
    }
}