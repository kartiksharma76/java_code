package linkedList;

public class InsertAtEnd {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if (head == null){
            return newNode;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static void display(Node head){
        while (head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before:");
        display(head);

        head = insertAtEnd(head, 40);

        System.out.println("After:");
        display(head);
    }


}
