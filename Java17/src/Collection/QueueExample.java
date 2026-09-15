package Collection;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");

        System.out.println("Printing Order:");
        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }
    }
}
