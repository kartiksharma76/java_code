package linkedlist;

import java.util.HashSet;

class Node7 {
    int data;
    Node7 next;

    Node7(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesUnsorted {

    static Node7 removeDuplicates(Node7 head) {

        if (head == null)
            return null;

        HashSet<Integer> set = new HashSet<>();

        Node7 temp = head;
        Node7 prev = null;

        while (temp != null) {

            if (set.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                set.add(temp.data);
                prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }

    static void display(Node7 head) {

        Node7 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node7 head = new Node7(10);
        head.next = new Node7(30);
        head.next.next = new Node7(20);
        head.next.next.next = new Node7(10);
        head.next.next.next.next = new Node7(40);
        head.next.next.next.next.next = new Node7(20);
        head.next.next.next.next.next.next = new Node7(50);
        head.next.next.next.next.next.next.next = new Node7(30);

        System.out.println("Original Linked List:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        display(head);
    }
}