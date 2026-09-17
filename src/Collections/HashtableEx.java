package Collections;

import java.util.Hashtable;

public class HashtableEx {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C++");

        System.out.println(table);
        System.out.println(table.get(1));
        table.remove(2);
        System.out.println(table);
    }
}
