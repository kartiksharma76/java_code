package Collection;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println("Books Popped from Stack:");
        while (!books.isEmpty()) {
            System.out.println("Popped: " + books.pop());
        }
    }
}
