package linkedlist;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindNode {

    static boolean search(Node1 head, int key) {
        Node1 temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        head.next.next.next.next = new Node1(50);

        int key = 30;

        if (search(head, key))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}