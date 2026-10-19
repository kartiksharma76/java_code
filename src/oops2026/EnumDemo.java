package oops2026;

enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
public class EnumDemo {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;
        switch (status){
            case PENDING -> System.out.println("Awaiting confirmation");
            case CONFIRMED -> System.out.println("Order confirmed");
            case SHIPPED -> System.out.println("Order dispatched");
            case DELIVERED -> System.out.println("Order delivered");
            case CANCELLED -> System.out.println("Order cancelled");
        }
    }
}
