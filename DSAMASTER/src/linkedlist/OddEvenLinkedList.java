package linkedlist;

class Node19 {
    int data;
    Node19 next;

    Node19(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OddEvenLinkedList {

    static Node19 oddEvenList(Node19 head) {

        if (head == null || head.next == null)
            return head;

        Node19 odd = head;
        Node19 even = head.next;
        Node19 evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    static void display(Node19 head) {

        Node19 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node19 head = new Node19(1);
        head.next = new Node19(2);
        head.next.next = new Node19(3);
        head.next.next.next = new Node19(4);
        head.next.next.next.next = new Node19(5);
        head.next.next.next.next.next = new Node19(6);

        System.out.println("Original Linked List:");
        display(head);

        head = oddEvenList(head);

        System.out.println("After Rearranging:");
        display(head);
    }
}