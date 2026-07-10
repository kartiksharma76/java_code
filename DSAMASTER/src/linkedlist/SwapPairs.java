package linkedlist;

class Node18 {
    int data;
    Node18 next;

    Node18(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SwapPairs {

    static Node18 swapPairs(Node18 head) {

        Node18 dummy = new Node18(0);
        dummy.next = head;

        Node18 prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            Node18 first = prev.next;
            Node18 second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
    }

    static void display(Node18 head) {

        Node18 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node18 head = new Node18(1);
        head.next = new Node18(2);
        head.next.next = new Node18(3);
        head.next.next.next = new Node18(4);

        System.out.println("Original Linked List:");
        display(head);

        head = swapPairs(head);

        System.out.println("After Swapping Pairs:");
        display(head);
    }
}