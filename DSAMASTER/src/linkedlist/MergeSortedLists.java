package linkedlist;

class Node25 {
    int data;
    Node25 next;

    Node25(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {

    static Node25 merge(Node25 head1, Node25 head2) {

        Node25 dummy = new Node25(0);
        Node25 current = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }

            current = current.next;
        }

        if (head1 != null)
            current.next = head1;

        if (head2 != null)
            current.next = head2;

        return dummy.next;
    }

    static void display(Node25 head) {

        Node25 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node25 head1 = new Node25(1);
        head1.next = new Node25(3);
        head1.next.next = new Node25(5);
        head1.next.next.next = new Node25(7);

        Node25 head2 = new Node25(2);
        head2.next = new Node25(4);
        head2.next.next = new Node25(6);
        head2.next.next.next = new Node25(8);

        System.out.println("First Linked List:");
        display(head1);

        System.out.println("Second Linked List:");
        display(head2);

        Node25 result = merge(head1, head2);

        System.out.println("Merged Linked List:");
        display(result);
    }
}