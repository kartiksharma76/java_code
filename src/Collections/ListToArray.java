package Collections;

import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        String[] arr = list.toArray(new String[0]);

        for (String value : arr) {
            System.out.println(value);
        }

    }
}
