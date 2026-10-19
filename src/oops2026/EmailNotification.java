package oops2026;

public class EmailNotification  implements  Notification{
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
