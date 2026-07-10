package linkedlist;

class Node12 {
    int data;
    Node12 next;

    Node12(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LengthOfLoop {

    static int findLoopLength(Node12 head) {

        Node12 slow = head;
        Node12 fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                int count = 1;
                Node12 temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Node12 head = new Node12(10);
        head.next = new Node12(20);
        head.next.next = new Node12(30);
        head.next.next.next = new Node12(40);
        head.next.next.next.next = new Node12(50);

        // Create Loop (50 -> 30)
        head.next.next.next.next.next = head.next.next;

        int length = findLoopLength(head);

        if (length == 0)
            System.out.println("No Loop");
        else
            System.out.println("Length of Loop = " + length);
    }
}