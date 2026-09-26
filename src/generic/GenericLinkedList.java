package generic;

public class GenericLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void insert(T data) {
        Node<T> node = new Node<>(data, null);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data, null);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = node;
        }

        size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data, null);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void addPosition(int position, T data) {

        if (position <= 1) {
            addFirst(data);
            return;
        }

        if (position > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == size + 1) {
            addLast(data);
            return;
        }

        Node<T> node = new Node<>(data, null);
        Node<T> temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public void deleteByPosition(int position) {

        if (head == null || position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node<T> temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
    }

    public T middleNode() {

        if (head == null) {
            return null;
        }

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public int occurrence(T data) {

        int count = 0;
        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(data)) {
                count++;
            }

            temp = temp.next;
        }

        return count;
    }

    public void deleteFirst() {

        if (head == null) {
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    public void deleteLast() {

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node<T> temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public void moveLastToFront() {

        if (head == null || head.next == null) {
            return;
        }

        Node<T> temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        Node<T> last = temp.next;

        temp.next = null;
        tail = temp;

        last.next = head;
        head = last;
    }

    public int size() {
        return size;
    }

    public boolean contains(T data) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(data)) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public void print() {

        Node<T> temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public class Node<E> {

        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}