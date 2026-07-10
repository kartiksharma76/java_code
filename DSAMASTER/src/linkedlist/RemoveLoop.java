package linkedlist;

class Node14 {
    int data;
    Node14 next;

    Node14(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveLoop {

    static void removeLoop(Node14 head) {

        if (head == null)
            return;

        Node14 slow = head;
        Node14 fast = head;
        boolean loop = false;

        // Detect Loop
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loop = true;
                break;
            }
        }

        if (!loop)
            return;

        slow = head;
        Node14 prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove Loop
        prev.next = null;
    }

    static void display(Node14 head) {

        Node14 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node14 head = new Node14(10);
        head.next = new Node14(20);
        head.next.next = new Node14(30);
        head.next.next.next = new Node14(40);
        head.next.next.next.next = new Node14(50);

        // Create Loop (50 -> 30)
        head.next.next.next.next.next = head.next.next;

        removeLoop(head);

        System.out.println("Linked List After Removing Loop:");
        display(head);
    }
}