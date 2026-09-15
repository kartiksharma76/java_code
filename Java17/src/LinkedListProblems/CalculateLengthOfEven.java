package LinkedListProblems;

public class CalculateLengthOfEven {
    private Node head;
    private int size;
    private Node tail;

    public void insert(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public boolean contains(int data) {
        Node temp = head;
        while (temp != null) {
            if (data == temp.data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public boolean isLengthEven() {
        return size % 2 == 0;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {
        return size;
    }

//    public int countEvenElements() {
//        int count = 0;
//        Node temp = head;
//        while (temp != null) {
//            if (temp.data % 2 == 0) {
//                count++;
//            }
//            temp = temp.next;
//        }
//        return count;
//    }

    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
