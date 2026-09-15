package linkedlist;

public class TestDLL {
    public static void main(String[] args) {

        DoublyLinkedList2 list = new DoublyLinkedList2();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.printForward();

        list.addFirst(5);
        list.printForward();

        list.addPosition(2, 15);
        list.printForward();

        list.deleteFirst();
        list.printForward();

        list.deleteLast();
        list.printForward();

        list.printBackward();

        System.out.println("Size: " + list.size());
    }
}