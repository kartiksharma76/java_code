package linkedlist;

class Node16 {
    int data;
    Node16 next;

    Node16(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // Iterative Reverse
    static Node16 reverseIterative(Node16 head) {

        Node16 prev = null;
        Node16 current = head;
        Node16 next = null;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Recursive Reverse
    static Node16 reverseRecursive(Node16 head) {

        if (head == null || head.next == null)
            return head;

        Node16 newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    static void display(Node16 head) {

        Node16 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node16 head = new Node16(10);
        head.next = new Node16(20);
        head.next.next = new Node16(30);
        head.next.next.next = new Node16(40);
        head.next.next.next.next = new Node16(50);

        System.out.println("Original Linked List:");
        display(head);

        head = reverseIterative(head);

        System.out.println("After Iterative Reverse:");
        display(head);

        head = reverseRecursive(head);

        System.out.println("After Recursive Reverse:");
        display(head);
    }
}