package linkedlist;

class Node39 {

    int data;
    Node39 next;
    Node39 bottom;

    Node39(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

public class FlattenLinkedList {

    static Node39 merge(Node39 a, Node39 b) {

        if (a == null)
            return b;

        if (b == null)
            return a;

        Node39 result;

        if (a.data < b.data) {

            result = a;
            result.bottom = merge(a.bottom, b);

        } else {

            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null;

        return result;
    }

    static Node39 flatten(Node39 root) {

        if (root == null || root.next == null)
            return root;

        root.next = flatten(root.next);

        return merge(root, root.next);
    }

    static void display(Node39 head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.bottom;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node39 head = new Node39(5);

        head.bottom = new Node39(7);
        head.bottom.bottom = new Node39(8);
        head.bottom.bottom.bottom = new Node39(30);

        head.next = new Node39(10);
        head.next.bottom = new Node39(20);

        head.next.next = new Node39(19);
        head.next.next.bottom = new Node39(22);
        head.next.next.bottom.bottom = new Node39(50);

        head.next.next.next = new Node39(28);
        head.next.next.next.bottom = new Node39(35);
        head.next.next.next.bottom.bottom = new Node39(40);
        head.next.next.next.bottom.bottom.bottom = new Node39(45);

        Node39 result = flatten(head);

        System.out.println("Flattened Linked List:");

        display(result);
    }
}