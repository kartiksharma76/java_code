package linkedlist;

public class DoublyLinkedList2 {

    private Root head;
    private Root tail;
    private int size;

    public void insert(int data) {
        Root node = new Root(data);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addFirst(int data) {
        Root node = new Root(data);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addPosition(int pos, int data) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            addFirst(data);
            return;
        }

        if (pos == size) {
            insert(data);
            return;
        }

        Root temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        Root node = new Root(data);

        node.next = temp.next;
        node.prev = temp;

        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    public void deleteFirst() {
        if (head == null) return;

        if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteLast() {
        if (tail == null) return;

        if (tail.prev == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void deletePosition(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            deleteFirst();
            return;
        }

        if (pos == size - 1) {
            deleteLast();
            return;
        }

        Root temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }

    public void printForward() {
        Root temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Root temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    

    public int size() {
        return size;
    }
}
class Root {
    int data;
    Root next;
    Root prev;

    public Root(int data) {
        this.data = data;
    }
}