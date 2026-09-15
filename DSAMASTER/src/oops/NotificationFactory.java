package oops;

interface Notification {

    void send();
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Email Sent");
    }
}

class SmsNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS Sent");
    }
}

class NotificationFactory {

    public static Notification getNotification(String type) {

        if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        }

        if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        }

        return null;
    }
}

//public class NotificationFactoryExample1 {
//
//    public static void main(String[] args) {
//
//        Notification notification = NotificationFactory.getNotification("Email");
//        notification.send();
//    }
//}
