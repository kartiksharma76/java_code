package linkedlist;

class Node30 {
    int data;
    Node30 next;

    Node30(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortLinkedList {

    // Find Middle
    static Node30 getMiddle(Node30 head) {

        if (head == null)
            return head;

        Node30 slow = head;
        Node30 fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge Two Sorted Lists
    static Node30 merge(Node30 left, Node30 right) {

        Node30 dummy = new Node30(0);
        Node30 tail = dummy;

        while (left != null && right != null) {

            if (left.data <= right.data) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }

            tail = tail.next;
        }

        if (left != null)
            tail.next = left;

        if (right != null)
            tail.next = right;

        return dummy.next;
    }

    // Merge Sort
    static Node30 mergeSort(Node30 head) {

        if (head == null || head.next == null)
            return head;

        Node30 middle = getMiddle(head);
        Node30 secondHalf = middle.next;
        middle.next = null;

        Node30 left = mergeSort(head);
        Node30 right = mergeSort(secondHalf);

        return merge(left, right);
    }

    static void display(Node30 head) {

        Node30 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node30 head = new Node30(4);
        head.next = new Node30(2);
        head.next.next = new Node30(1);
        head.next.next.next = new Node30(3);
        head.next.next.next.next = new Node30(5);

        System.out.println("Original Linked List:");
        display(head);

        head = mergeSort(head);

        System.out.println("Sorted Linked List:");
        display(head);
    }
}