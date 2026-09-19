package DsaQuestions.Adobe;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public static Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();

        // Step 1: Create copy of every node
        Node current = head;

        while (current != null) {

            map.put(
                    current,
                    new Node(current.val)
            );

            current = current.next;
        }

        // Step 2: Connect next and random
        current = head;

        while (current != null) {

            Node copy = map.get(current);

            copy.next = map.get(current.next);

            copy.random = map.get(current.random);

            current = current.next;
        }

        return map.get(head);
    }

    public static void printList(Node head) {

        Node current = head;

        while (current != null) {

            System.out.print(
                    "Node: " + current.val
            );

            if (current.random != null) {
                System.out.print(
                        ", Random: " + current.random.val
                );
            } else {
                System.out.print(
                        ", Random: null"
                );
            }

            System.out.println();

            current = current.next;
        }
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        node1.random = node3;
        node2.random = node1;
        node3.random = node2;

        Node copied =
                copyRandomList(node1);

        System.out.println("Copied List:");

        printList(copied);
    }

    static class Node {

        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }
}