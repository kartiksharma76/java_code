package linkedlist;

class Node5 {
    int data;
    Node5 next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesSorted {

    static Node5 removeDuplicates(Node5 head) {

        if (head == null)
            return null;

        Node5 temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    static void display(Node5 head) {

        Node5 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node5 head = new Node5(10);
        head.next = new Node5(20);
        head.next.next = new Node5(20);
        head.next.next.next = new Node5(30);
        head.next.next.next.next = new Node5(30);
        head.next.next.next.next.next = new Node5(30);
        head.next.next.next.next.next.next = new Node5(40);
        head.next.next.next.next.next.next.next = new Node5(50);
        head.next.next.next.next.next.next.next.next = new Node5(50);

        System.out.println("Original Linked List:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        display(head);
    }
}