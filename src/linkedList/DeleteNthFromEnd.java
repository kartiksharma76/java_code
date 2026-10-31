package linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNthFromEnd {
    public static Node deleteNthFromEnd(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        // Step 1: Move fast n + 1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Step 2: Move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Delete the target node
        slow.next = slow.next.next;

        // Step 4: Return updated head
        return dummy.next;
    }

    // Print linked list
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(13);
        head.next.next = new Node(9);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(10);

        System.out.println("Original Linked List :");
        printList(head);

        int n = 2;

        head = deleteNthFromEnd(head, n);
        System.out.println("After Deleting " + n + "th node from the end:");
        printList(head);
    }
}
