package linkedlist;

class DNode33 {
    int data;
    DNode33 prev;
    DNode33 next;

    DNode33(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class ReverseDLL {

    static DNode33 reverse(DNode33 head) {

        if (head == null)
            return null;

        DNode33 current = head;
        DNode33 temp = null;

        while (current != null) {

            // Swap prev and next
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to previous (original next)
            current = current.prev;
        }

        // Update head
        if (temp != null)
            head = temp.prev;

        return head;
    }

    static void display(DNode33 head) {

        DNode33 temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {

        DNode33 head = new DNode33(10);
        head.next = new DNode33(20);
        head.next.prev = head;

        head.next.next = new DNode33(30);
        head.next.next.prev = head.next;

        head.next.next.next = new DNode33(40);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new DNode33(50);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original DLL:");
        display(head);

        head = reverse(head);

        System.out.println("Reversed DLL:");
        display(head);
    }
}