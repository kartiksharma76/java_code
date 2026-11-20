package java8practice.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Riya");
        students.add("Aman");
        students.add("Karan");

        System.out.println("Students List: ");
        for(String s: students){
            System.out.println(s);
        }
    }
}
