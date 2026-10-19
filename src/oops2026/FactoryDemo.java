package oops2026;

public class FactoryDemo {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.create("email");

        notification.send("Welcome to Java");
    }
}
