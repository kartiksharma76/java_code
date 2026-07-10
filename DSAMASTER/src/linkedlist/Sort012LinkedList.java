package linkedlist;

class Node26 {
    int data;
    Node26 next;

    Node26(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Sort012LinkedList {

    static Node26 sort(Node26 head) {

        int zero = 0;
        int one = 0;
        int two = 0;

        Node26 temp = head;

        // Count 0s, 1s and 2s
        while (temp != null) {

            if (temp.data == 0)
                zero++;
            else if (temp.data == 1)
                one++;
            else
                two++;

            temp = temp.next;
        }

        temp = head;

        // Fill 0s
        while (zero-- > 0) {
            temp.data = 0;
            temp = temp.next;
        }

        // Fill 1s
        while (one-- > 0) {
            temp.data = 1;
            temp = temp.next;
        }

        // Fill 2s
        while (two-- > 0) {
            temp.data = 2;
            temp = temp.next;
        }

        return head;
    }

    static void display(Node26 head) {

        Node26 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node26 head = new Node26(1);
        head.next = new Node26(2);
        head.next.next = new Node26(0);
        head.next.next.next = new Node26(1);
        head.next.next.next.next = new Node26(2);
        head.next.next.next.next.next = new Node26(0);
        head.next.next.next.next.next.next = new Node26(1);

        System.out.println("Original Linked List:");
        display(head);

        head = sort(head);

        System.out.println("Sorted Linked List:");
        display(head);
    }
}