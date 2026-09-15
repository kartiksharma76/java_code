package linkedlist;

class Node17 {
    int data;
    Node17 next;

    Node17(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    static Node17 reverse(Node17 head) {

        Node17 prev = null;
        Node17 current = head;

        while (current != null) {

            Node17 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static boolean isPalindrome(Node17 head) {

        if (head == null || head.next == null)
            return true;

        Node17 slow = head;
        Node17 fast = head;

        // Find Middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse Second Half
        Node17 secondHalf = reverse(slow);
        Node17 firstHalf = head;

        // Compare Both Halves
        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    static void display(Node17 head) {

        Node17 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node17 head = new Node17(1);
        head.next = new Node17(2);
        head.next.next = new Node17(3);
        head.next.next.next = new Node17(2);
        head.next.next.next.next = new Node17(1);

        System.out.println("Linked List:");
        display(head);

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}