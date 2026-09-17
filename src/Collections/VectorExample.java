package Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println(vector);

        vector.addElement(40);

        System.out.println(vector);

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }
}
