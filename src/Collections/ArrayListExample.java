package Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list);
        System.out.println(list.get(1));

        list.set(1,50);
        list.remove(Integer.valueOf(20));

        System.out.println(list);
        System.out.println(list.contains(30));
        System.out.println(list.size());

    }
}
