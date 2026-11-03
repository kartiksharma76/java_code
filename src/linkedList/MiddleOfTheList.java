package linkedList;

class ListNodes {
    int val;
    ListNodes next;

    ListNodes(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleOfTheList {
    public static ListNodes middleNodes(ListNodes head) {
        ListNodes slow = head;
        ListNodes fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void printList(ListNodes head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        ListNodes head = new ListNodes(1);
        head.next = new ListNodes(2);
        head.next.next = new ListNodes(3);
        head.next.next.next = new ListNodes(4);
        head.next.next.next.next = new ListNodes(5);


        ListNodes middle = middleNodes(head);
        System.out.println("Middle node is list:");
        printList(middle);
    }

}
