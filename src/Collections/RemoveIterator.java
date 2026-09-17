package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {

            int value = itr.next();

            if (value == 20) {
                itr.remove();
            }
        }

        System.out.println(list);
    }
}
