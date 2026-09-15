package linkedlist;

class Node20 {
    int data;
    Node20 next;

    Node20(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReorderLinkedList {

    static Node20 reverse(Node20 head) {

        Node20 prev = null;
        Node20 current = head;

        while (current != null) {

            Node20 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static void reorder(Node20 head) {

        if (head == null || head.next == null)
            return;

        // Find Middle
        Node20 slow = head;
        Node20 fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse Second Half
        Node20 second = reverse(slow.next);
        slow.next = null;

        // Merge Both Halves
        Node20 first = head;

        while (second != null) {

            Node20 temp1 = first.next;
            Node20 temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    static void display(Node20 head) {

        Node20 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node20 head = new Node20(1);
        head.next = new Node20(2);
        head.next.next = new Node20(3);
        head.next.next.next = new Node20(4);
        head.next.next.next.next = new Node20(5);

        System.out.println("Original Linked List:");
        display(head);

        reorder(head);

        System.out.println("After Reordering:");
        display(head);
    }
}