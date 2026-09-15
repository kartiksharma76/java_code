package linkedlist;

class DNode37 {
    int data;
    DNode37 prev;
    DNode37 next;

    DNode37(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class PairSumDLL {

    static void findPairs(DNode37 head, int target) {

        if (head == null)
            return;

        DNode37 left = head;
        DNode37 right = head;

        // Move right to last node
        while (right.next != null) {
            right = right.next;
        }

        boolean found = false;

        while (left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == target) {

                System.out.println("(" + left.data + ", " + right.data + ")");
                found = true;

                left = left.next;
                right = right.prev;

            } else if (sum < target) {

                left = left.next;

            } else {

                right = right.prev;
            }
        }

        if (!found)
            System.out.println("No Pair Found");
    }

    static void display(DNode37 head) {

        DNode37 temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {

        DNode37 head = new DNode37(1);

        head.next = new DNode37(2);
        head.next.prev = head;

        head.next.next = new DNode37(4);
        head.next.next.prev = head.next;

        head.next.next.next = new DNode37(5);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new DNode37(6);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new DNode37(8);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head.next.next.next.next.next.next = new DNode37(9);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        System.out.println("Doubly Linked List:");
        display(head);

        System.out.println("Pairs with Sum = 7");
        findPairs(head, 7);
    }
}