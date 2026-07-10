package linkedlist;

class Node28 {
    int data;
    Node28 next;

    Node28(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PartitionLinkedList {

    static Node28 partition(Node28 head, int x) {

        Node28 smallerDummy = new Node28(0);
        Node28 greaterDummy = new Node28(0);

        Node28 smaller = smallerDummy;
        Node28 greater = greaterDummy;

        Node28 current = head;

        while (current != null) {

            if (current.data < x) {
                smaller.next = current;
                smaller = smaller.next;
            } else {
                greater.next = current;
                greater = greater.next;
            }

            current = current.next;
        }

        greater.next = null;
        smaller.next = greaterDummy.next;

        return smallerDummy.next;
    }

    static void display(Node28 head) {

        Node28 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node28 head = new Node28(1);
        head.next = new Node28(4);
        head.next.next = new Node28(3);
        head.next.next.next = new Node28(2);
        head.next.next.next.next = new Node28(5);
        head.next.next.next.next.next = new Node28(2);

        System.out.println("Original Linked List:");
        display(head);

        head = partition(head, 3);

        System.out.println("After Partition:");
        display(head);
    }
}