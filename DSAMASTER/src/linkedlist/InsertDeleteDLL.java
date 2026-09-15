package linkedlist;

class DNode32 {
    int data;
    DNode32 prev;
    DNode32 next;

    DNode32(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class InsertDeleteDLL {

    // Insert at End
    static DNode32 insert(DNode32 head, int data) {

        DNode32 newNode = new DNode32(data);

        if (head == null)
            return newNode;

        DNode32 temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Delete by Value
    static DNode32 delete(DNode32 head, int key) {

        if (head == null)
            return null;

        if (head.data == key) {
            head = head.next;

            if (head != null)
                head.prev = null;

            return head;
        }

        DNode32 temp = head;

        while (temp != null && temp.data != key)
            temp = temp.next;

        if (temp == null)
            return head;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        temp.prev.next = temp.next;

        return head;
    }

    static void display(DNode32 head) {

        DNode32 temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {

        DNode32 head = new DNode32(10);
        head.next = new DNode32(20);
        head.next.prev = head;

        head.next.next = new DNode32(30);
        head.next.next.prev = head.next;

        System.out.println("Original DLL:");
        display(head);

        head = insert(head, 40);

        System.out.println("After Insert:");
        display(head);

        head = delete(head, 20);

        System.out.println("After Delete:");
        display(head);
    }
}