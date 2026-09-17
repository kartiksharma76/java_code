package Collections;

import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Kartik");
        names.add("Rahul");
        names.add("Aman");

        for (String name : names) {
            System.out.println(name);
        }
    }

}
