package Collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.higher(20));
        System.out.println(set.lower(30));
    }
}
