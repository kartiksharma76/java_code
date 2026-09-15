package linkedlist;

class Node6 {
    int data;
    Node6 next;

    Node6(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteGivenNode {

    static void deleteNode(Node6 node) {

        if (node == null || node.next == null) {
            System.out.println("Cannot delete the last node.");
            return;
        }

        node.data = node.next.data;
        node.next = node.next.next;
    }

    static void display(Node6 head) {

        Node6 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node6 head = new Node6(10);
        head.next = new Node6(20);
        head.next.next = new Node6(30);
        head.next.next.next = new Node6(40);
        head.next.next.next.next = new Node6(50);

        System.out.println("Original Linked List:");
        display(head);

        // Reference to node containing 30
        Node6 nodeToDelete = head.next.next;

        deleteNode(nodeToDelete);

        System.out.println("After Deleting 30:");
        display(head);
    }
}