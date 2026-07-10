package linkedlist;

class DNode34 {
    int data;
    DNode34 prev;
    DNode34 next;

    DNode34(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class RemoveDuplicatesDLL {

    static DNode34 removeDuplicates(DNode34 head) {

        if (head == null)
            return null;

        DNode34 current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {

                current.next = current.next.next;

                if (current.next != null)
                    current.next.prev = current;

            } else {
                current = current.next;
            }
        }

        return head;
    }

    static void display(DNode34 head) {

        DNode34 temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {

        DNode34 head = new DNode34(10);

        head.next = new DNode34(20);
        head.next.prev = head;

        head.next.next = new DNode34(20);
        head.next.next.prev = head.next;

        head.next.next.next = new DNode34(30);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new DNode34(30);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new DNode34(40);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head.next.next.next.next.next.next = new DNode34(50);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        head.next.next.next.next.next.next.next = new DNode34(50);
        head.next.next.next.next.next.next.next.prev = head.next.next.next.next.next.next;

        System.out.println("Original DLL:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        display(head);
    }
}