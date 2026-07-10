package linkedlist;

class Node9 {
    int data;
    Node9 next;

    Node9(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNode {

    static Node9 findMiddle(Node9 head) {

        if (head == null)
            return null;

        Node9 slow = head;
        Node9 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static void display(Node9 head) {

        Node9 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node9 head = new Node9(10);
        head.next = new Node9(20);
        head.next.next = new Node9(30);
        head.next.next.next = new Node9(40);
        head.next.next.next.next = new Node9(50);

        System.out.println("Linked List:");
        display(head);

        Node9 middle = findMiddle(head);

        System.out.println("Middle Node = " + middle.data);
    }
}