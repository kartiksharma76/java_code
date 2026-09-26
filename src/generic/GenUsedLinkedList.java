package generic;

public class GenUsedLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void insert(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data, null);
        node.next = node;
        size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void addPosition(int position, T data) {
        Node<T> node = new Node<>(data, null);
        Node<T> temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteByPosition(int position) {
        Node<T> temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public T middleNode() {
        Node<T> node = head;
        Node<T> temp = head;
        while (temp != null && temp.next != null) {
            node = node.next;
            temp = temp.next.next;
        }
        return node.data;
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
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {
        if (head == null || head.next == null) {
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
        if (head == null || head.next == null)
            return;

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

    public class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

    }
}
