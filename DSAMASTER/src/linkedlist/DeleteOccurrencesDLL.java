package linkedlist;

class DNode36 {
    int data;
    DNode36 prev;
    DNode36 next;

    DNode36(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DeleteOccurrencesDLL {

    static DNode36 deleteAll(DNode36 head, int key) {

        DNode36 current = head;

        while (current != null) {

            DNode36 nextNode = current.next;

            if (current.data == key) {

                // If current is head
                if (current.prev == null) {
                    head = current.next;

                    if (head != null)
                        head.prev = null;
                } else {

                    current.prev.next = current.next;

                    if (current.next != null)
                        current.next.prev = current.prev;
                }
            }

            current = nextNode;
        }

        return head;
    }

    static void display(DNode36 head) {

        DNode36 temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {

        DNode36 head = new DNode36(10);

        head.next = new DNode36(20);
        head.next.prev = head;

        head.next.next = new DNode36(30);
        head.next.next.prev = head.next;

        head.next.next.next = new DNode36(20);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new DNode36(40);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new DNode36(20);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head.next.next.next.next.next.next = new DNode36(50);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        System.out.println("Original DLL:");
        display(head);

        head = deleteAll(head, 20);

        System.out.println("After Deleting 20:");
        display(head);
    }
}