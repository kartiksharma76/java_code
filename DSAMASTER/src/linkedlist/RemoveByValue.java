package linkedlist;

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveByValue {

    static Node4 remove(Node4 head, int val) {

        // Remove matching nodes from the beginning
        while (head != null && head.data == val) {
            head = head.next;
        }

        Node4 temp = head;

        while (temp != null && temp.next != null) {

            if (temp.next.data == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    static void display(Node4 head) {

        Node4 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node4 head = new Node4(10);
        head.next = new Node4(20);
        head.next.next = new Node4(30);
        head.next.next.next = new Node4(20);
        head.next.next.next.next = new Node4(40);
        head.next.next.next.next.next = new Node4(20);
        head.next.next.next.next.next.next = new Node4(50);

        System.out.println("Original Linked List:");
        display(head);

        head = remove(head, 20);

        System.out.println("After Removing 20:");
        display(head);
    }
}