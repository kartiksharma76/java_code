package linkedlist;

class Node40 {
    int data;
    Node40 next;

    Node40(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseKGroup {

    static Node40 reverseK(Node40 head, int k) {

        if (head == null)
            return null;

        // Check if at least k nodes are available
        Node40 temp = head;
        int count = 0;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // If less than k nodes, do not reverse
        if (count < k)
            return head;

        Node40 prev = null;
        Node40 current = head;
        Node40 next = null;

        count = 0;

        // Reverse first k nodes
        while (current != null && count < k) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Connect remaining list
        head.next = reverseK(current, k);

        return prev;
    }

    static void display(Node40 head) {

        Node40 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node40 head = new Node40(1);
        head.next = new Node40(2);
        head.next.next = new Node40(3);
        head.next.next.next = new Node40(4);
        head.next.next.next.next = new Node40(5);
        head.next.next.next.next.next = new Node40(6);
        head.next.next.next.next.next.next = new Node40(7);
        head.next.next.next.next.next.next.next = new Node40(8);

        System.out.println("Original Linked List:");
        display(head);

        head = reverseK(head, 3);

        System.out.println("After Reversing in Groups of 3:");
        display(head);
    }
}