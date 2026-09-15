package linkedlist;

class Node41 {
    int data;
    Node41 next;

    Node41(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseAlternateKNodes {

    static Node41 reverseAlternate(Node41 head, int k) {

        if (head == null)
            return null;

        Node41 current = head;
        Node41 prev = null;
        Node41 next = null;

        int count = 0;

        // Reverse first k nodes
        while (current != null && count < k) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Connect last node of reversed group
        head.next = current;

        // Skip next k nodes
        count = 1;

        Node41 temp = current;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // Recursively reverse alternate groups
        if (temp != null)
            temp.next = reverseAlternate(temp.next, k);

        return prev;
    }

    static void display(Node41 head) {

        Node41 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node41 head = new Node41(1);
        head.next = new Node41(2);
        head.next.next = new Node41(3);
        head.next.next.next = new Node41(4);
        head.next.next.next.next = new Node41(5);
        head.next.next.next.next.next = new Node41(6);
        head.next.next.next.next.next.next = new Node41(7);
        head.next.next.next.next.next.next.next = new Node41(8);
        head.next.next.next.next.next.next.next.next = new Node41(9);
        head.next.next.next.next.next.next.next.next.next = new Node41(10);

        System.out.println("Original Linked List:");
        display(head);

        head = reverseAlternate(head, 3);

        System.out.println("After Reversing Alternate K Nodes:");
        display(head);
    }
}