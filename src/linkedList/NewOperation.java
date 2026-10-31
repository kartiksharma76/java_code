package linkedList;

public class NewOperation {
    // Insert node at end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Display linked list
    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Unique operation: Move maximum node to end
    static Node moveMaximumToEnd(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node maxNode = head;
        Node maxPrev = null;

        Node prev = null;
        Node curr = head;

        // Find maximum node and its previous node
        while (curr != null) {
            if (curr.data > maxNode.data) {
                maxNode = curr;
                maxPrev = prev;
            }

            prev = curr;
            curr = curr.next;
        }

        // If maximum node is already at the end
        if (maxNode.next == null) {
            return head;
        }

        // Remove maximum node from its current position
        if (maxPrev == null) {
            head = maxNode.next;
        } else {
            maxPrev.next = maxNode.next;
        }

        // Find the last node
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Move maximum node to the end
        temp.next = maxNode;
        maxNode.next = null;

        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 10);
        head = insert(head, 50);
        head = insert(head, 20);
        head = insert(head, 80);
        head = insert(head, 30);

        System.out.println("Original Linked List:");
        display(head);

        head = moveMaximumToEnd(head);

        System.out.println("After Moving Maximum Node to End:");
        display(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
