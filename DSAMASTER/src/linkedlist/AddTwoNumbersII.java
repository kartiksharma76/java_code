package linkedlist;

import java.util.Stack;

class Node24 {
    int data;
    Node24 next;

    Node24(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumbersII {

    static Node24 add(Node24 l1, Node24 l2) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.data);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.data);
            l2 = l2.next;
        }

        int carry = 0;
        Node24 head = null;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!s1.isEmpty())
                sum += s1.pop();

            if (!s2.isEmpty())
                sum += s2.pop();

            Node24 newNode = new Node24(sum % 10);
            newNode.next = head;
            head = newNode;

            carry = sum / 10;
        }

        return head;
    }

    static void display(Node24 head) {

        Node24 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node24 l1 = new Node24(7);
        l1.next = new Node24(2);
        l1.next.next = new Node24(4);
        l1.next.next.next = new Node24(3);

        Node24 l2 = new Node24(5);
        l2.next = new Node24(6);
        l2.next.next = new Node24(4);

        System.out.println("First Number:");
        display(l1);

        System.out.println("Second Number:");
        display(l2);

        Node24 result = add(l1, l2);

        System.out.println("Sum:");
        display(result);
    }
}