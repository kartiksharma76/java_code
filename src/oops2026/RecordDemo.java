package oops2026;

record User(int id, String name) {
    User {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
    }
}

public class RecordDemo {
    public static void main(String[] args) {
        User user = new User(101, "Kartik");

        System.out.println(user.id());
        System.out.println(user.name());
        System.out.println(user);
    }
}