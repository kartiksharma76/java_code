package linkedlist;

import java.util.HashMap;

class RandomNode38 {

    int data;
    RandomNode38 next;
    RandomNode38 random;

    RandomNode38(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class CloneRandomList {

    static RandomNode38 cloneList(RandomNode38 head) {

        if (head == null)
            return null;

        HashMap<RandomNode38, RandomNode38> map = new HashMap<>();

        RandomNode38 temp = head;

        // Create Copy of Every Node
        while (temp != null) {
            map.put(temp, new RandomNode38(temp.data));
            temp = temp.next;
        }

        temp = head;

        // Connect Next and Random
        while (temp != null) {

            RandomNode38 copy = map.get(temp);

            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }

    static void display(RandomNode38 head) {

        RandomNode38 temp = head;

        while (temp != null) {

            System.out.print("Node = " + temp.data);

            if (temp.random != null)
                System.out.print(" Random = " + temp.random.data);
            else
                System.out.print(" Random = null");

            System.out.println();

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        RandomNode38 head = new RandomNode38(1);

        head.next = new RandomNode38(2);
        head.next.next = new RandomNode38(3);

        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next;

        System.out.println("Original List:");
        display(head);

        RandomNode38 clone = cloneList(head);

        System.out.println("\nCloned List:");
        display(clone);
    }
}