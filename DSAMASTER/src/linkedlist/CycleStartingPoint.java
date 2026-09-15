package linkedlist;

class Node13 {
    int data;
    Node13 next;

    Node13(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleStartingPoint {

    static Node13 findStartingNode(Node13 head) {

        if (head == null)
            return null;

        Node13 slow = head;
        Node13 fast = head;

        // Detect Loop
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Node13 head = new Node13(10);
        head.next = new Node13(20);
        head.next.next = new Node13(30);
        head.next.next.next = new Node13(40);
        head.next.next.next.next = new Node13(50);

        // Create Loop (50 -> 30)
        head.next.next.next.next.next = head.next.next;

        Node13 start = findStartingNode(head);

        if (start != null)
            System.out.println("Starting Node of Loop = " + start.data);
        else
            System.out.println("No Loop");
    }
}