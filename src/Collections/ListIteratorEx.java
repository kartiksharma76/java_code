package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> itr = list.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
