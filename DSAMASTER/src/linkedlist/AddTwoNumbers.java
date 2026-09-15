package linkedlist;

class Node23 {
    int data;
    Node23 next;

    Node23(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumbers {

    static Node23 add(Node23 l1, Node23 l2) {

        Node23 dummy = new Node23(0);
        Node23 current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new Node23(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    static void display(Node23 head) {

        Node23 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node23 l1 = new Node23(2);
        l1.next = new Node23(4);
        l1.next.next = new Node23(3);

        Node23 l2 = new Node23(5);
        l2.next = new Node23(6);
        l2.next.next = new Node23(4);

        System.out.println("First Number:");
        display(l1);

        System.out.println("Second Number:");
        display(l2);

        Node23 result = add(l1, l2);

        System.out.println("Sum:");
        display(result);
    }
}