package linkedlist;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertMiddle {

    static Node3 insertAtPosition(Node3 head, int data, int position) {

        Node3 newNode = new Node3(data);

        // Insert at Head
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node3 temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    static void display(Node3 head) {

        Node3 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node3 head = new Node3(10);
        head.next = new Node3(20);
        head.next.next = new Node3(40);
        head.next.next.next = new Node3(50);

        System.out.println("Original Linked List:");
        display(head);

        head = insertAtPosition(head, 30, 3);

        System.out.println("After Inserting at Position 3:");
        display(head);
    }
}