package linkedlist;

class Node21 {
    int data;
    Node21 next;

    Node21(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RotateLinkedList {

    static Node21 rotateRight(Node21 head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        Node21 temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;

        if (k == 0)
            return head;

        // Make Circular Linked List
        temp.next = head;

        int steps = length - k;
        Node21 newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        Node21 newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    static void display(Node21 head) {

        Node21 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node21 head = new Node21(10);
        head.next = new Node21(20);
        head.next.next = new Node21(30);
        head.next.next.next = new Node21(40);
        head.next.next.next.next = new Node21(50);

        System.out.println("Original Linked List:");
        display(head);

        head = rotateRight(head, 2);

        System.out.println("After Rotation:");
        display(head);
    }
}