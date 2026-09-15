package linkedlist;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertHeadTail {

    // Insert at Head
    static Node2 insertHead(Node2 head, int data) {

        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    // Insert at Tail
    static Node2 insertTail(Node2 head, int data) {

        Node2 newNode = new Node2(data);

        if (head == null)
            return newNode;

        Node2 temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Display Linked List
    static void display(Node2 head) {

        Node2 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node2 head = new Node2(20);
        head.next = new Node2(30);
        head.next.next = new Node2(40);

        System.out.println("Original Linked List:");
        display(head);

        head = insertHead(head, 10);

        System.out.println("After Inserting at Head:");
        display(head);

        head = insertTail(head, 50);

        System.out.println("After Inserting at Tail:");
        display(head);
    }
}