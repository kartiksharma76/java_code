package oops2026;

public class NotificationFactory {
    static Notification create(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Unsupported notification type: " + type);
        };
    }
}
