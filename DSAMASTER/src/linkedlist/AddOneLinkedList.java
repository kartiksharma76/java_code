package linkedlist;

class Node22 {
    int data;
    Node22 next;

    Node22(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddOneLinkedList {

    static Node22 reverse(Node22 head) {

        Node22 prev = null;
        Node22 current = head;

        while (current != null) {
            Node22 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static Node22 addOne(Node22 head) {

        head = reverse(head);

        Node22 temp = head;
        int carry = 1;

        while (temp != null) {

            int sum = temp.data + carry;

            temp.data = sum % 10;
            carry = sum / 10;

            if (carry == 0)
                break;

            if (temp.next == null) {
                temp.next = new Node22(0);
            }

            temp = temp.next;
        }

        return reverse(head);
    }

    static void display(Node22 head) {

        Node22 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node22 head = new Node22(9);
        head.next = new Node22(9);
        head.next.next = new Node22(9);

        System.out.println("Original Number:");
        display(head);

        head = addOne(head);

        System.out.println("After Adding One:");
        display(head);
    }
}