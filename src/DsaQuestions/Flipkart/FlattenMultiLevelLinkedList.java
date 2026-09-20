package DsaQuestions.Flipkart;

public class FlattenMultiLevelLinkedList {
    public static Node flatten(Node head) {
        if (head == null || head.next == null) {
            return head;

        }
        head.next = flatten(head.next);

        if (head.child != null) {
            Node childList = flatten(head.child);

            head.next = merge(childList, head.next);
            head.child = null;
        }
        return head;

    }

    private static Node merge(Node first, Node second) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (first != null && second != null) {

            if (first.val <= second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }
        if (first != null) {
            current.next = first;
        } else {
            current.next = second;
        }
        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(7);

        n1.next = n2;
        n2.next = n3;

        Node n4 = new Node(5);
        Node n5 = new Node(6);

        n4.next = n5;

        // Multi-level connection
        n2.child = n4;

        Node result = flatten(n1);

        System.out.println("Flattened List:");
        printList(result);
    }

    static class Node {
        int val;
        Node next;
        Node child;

        Node(int val) {
            this.val = val;
        }

    }
}
