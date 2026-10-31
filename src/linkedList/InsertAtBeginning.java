package linkedList;

public class InsertAtBeginning {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static Node insertAtBeginning(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static  void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before:");
        display(head);

        head = insertAtBeginning(head, 5);

        System.out.println("After:");
        display(head);
    }

}
