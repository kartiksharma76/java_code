package linkedlist;

class Node27 {
    int data;
    Node27 next;

    Node27(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SegregateEvenOdd {

    static Node27 segregate(Node27 head) {

        if (head == null)
            return null;

        Node27 evenHead = null;
        Node27 evenTail = null;
        Node27 oddHead = null;
        Node27 oddTail = null;

        Node27 current = head;

        while (current != null) {

            if (current.data % 2 == 0) {

                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }

            } else {

                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }

            current = current.next;
        }

        if (evenHead == null)
            return oddHead;

        if (oddHead == null)
            return evenHead;

        evenTail.next = oddHead;
        oddTail.next = null;

        return evenHead;
    }

    static void display(Node27 head) {

        Node27 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node27 head = new Node27(1);
        head.next = new Node27(2);
        head.next.next = new Node27(3);
        head.next.next.next = new Node27(4);
        head.next.next.next.next = new Node27(5);
        head.next.next.next.next.next = new Node27(6);

        System.out.println("Original Linked List:");
        display(head);

        head = segregate(head);

        System.out.println("After Segregation:");
        display(head);
    }
}