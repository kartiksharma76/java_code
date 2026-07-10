package linkedlist;

class DNode35 {
    int data;
    DNode35 prev;
    DNode35 next;

    DNode35(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class InsertSortedDLL {

    static DNode35 insert(DNode35 head, int data) {

        DNode35 newNode = new DNode35(data);

        // Empty List
        if (head == null)
            return newNode;

        // Insert at Beginning
        if (data <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        DNode35 current = head;

        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;

        return head;
    }

    static void display(DNode35 head) {

        DNode35 temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {

        DNode35 head = new DNode35(10);

        head.next = new DNode35(20);
        head.next.prev = head;

        head.next.next = new DNode35(40);
        head.next.next.prev = head.next;

        head.next.next.next = new DNode35(50);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original DLL:");
        display(head);

        head = insert(head, 30);

        System.out.println("After Inserting 30:");
        display(head);
    }
}