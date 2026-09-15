package linkedlist;

class Node8 {
    int data;
    Node8 next;

    Node8(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMiddleNode {

    static Node8 deleteMiddle(Node8 head) {

        if (head == null || head.next == null)
            return null;

        Node8 slow = head;
        Node8 fast = head;
        Node8 prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
    }

    static void display(Node8 head) {

        Node8 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node8 head = new Node8(10);
        head.next = new Node8(20);
        head.next.next = new Node8(30);
        head.next.next.next = new Node8(40);
        head.next.next.next.next = new Node8(50);

        System.out.println("Original Linked List:");
        display(head);

        head = deleteMiddle(head);

        System.out.println("After Deleting Middle Node:");
        display(head);
    }
}