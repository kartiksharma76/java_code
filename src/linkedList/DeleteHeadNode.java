package linkedList;

public class DeleteHeadNode {
    static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before:");
        display(head);

        head = deleteHead(head);

        System.out.println("After:");
        display(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
