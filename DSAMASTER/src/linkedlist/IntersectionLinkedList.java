package linkedlist;

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionLinkedList {

    static Node11 getIntersection(Node11 headA, Node11 headB) {

        if (headA == null || headB == null)
            return null;

        Node11 p1 = headA;
        Node11 p2 = headB;

        while (p1 != p2) {

            if (p1 == null)
                p1 = headB;
            else
                p1 = p1.next;

            if (p2 == null)
                p2 = headA;
            else
                p2 = p2.next;
        }

        return p1;
    }

    static void display(Node11 head) {

        Node11 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Common Part
        Node11 common = new Node11(30);
        common.next = new Node11(40);
        common.next.next = new Node11(50);

        // List A
        Node11 headA = new Node11(10);
        headA.next = new Node11(20);
        headA.next.next = common;

        // List B
        Node11 headB = new Node11(15);
        headB.next = common;

        System.out.println("List A:");
        display(headA);

        System.out.println("List B:");
        display(headB);

        Node11 result = getIntersection(headA, headB);

        if (result != null)
            System.out.println("Intersection Node = " + result.data);
        else
            System.out.println("No Intersection");
    }
}