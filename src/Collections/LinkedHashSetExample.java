package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }
}
