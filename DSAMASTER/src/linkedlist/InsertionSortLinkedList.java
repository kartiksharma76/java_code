package linkedlist;

class Node29 {
    int data;
    Node29 next;

    Node29(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionSortLinkedList {

    static Node29 insertionSort(Node29 head) {

        Node29 dummy = new Node29(0);

        Node29 current = head;

        while (current != null) {

            Node29 nextNode = current.next;

            Node29 prev = dummy;

            while (prev.next != null && prev.next.data < current.data) {
                prev = prev.next;
            }

            current.next = prev.next;
            prev.next = current;

            current = nextNode;
        }

        return dummy.next;
    }

    static void display(Node29 head) {

        Node29 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node29 head = new Node29(4);
        head.next = new Node29(2);
        head.next.next = new Node29(1);
        head.next.next.next = new Node29(3);

        System.out.println("Original Linked List:");
        display(head);

        head = insertionSort(head);

        System.out.println("Sorted Linked List:");
        display(head);
    }
}