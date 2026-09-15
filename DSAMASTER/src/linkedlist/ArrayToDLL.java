package linkedlist;

class DNode31 {
    int data;
    DNode31 prev;
    DNode31 next;

    DNode31(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class ArrayToDLL {

    static DNode31 convert(int[] arr) {

        if (arr.length == 0)
            return null;

        DNode31 head = new DNode31(arr[0]);
        DNode31 current = head;

        for (int i = 1; i < arr.length; i++) {

            DNode31 newNode = new DNode31(arr[i]);

            current.next = newNode;
            newNode.prev = current;

            current = newNode;
        }

        return head;
    }

    static void display(DNode31 head) {

        DNode31 temp = head;

        System.out.print("null <- ");

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        DNode31 head = convert(arr);

        System.out.println("Doubly Linked List:");

        display(head);
    }
}