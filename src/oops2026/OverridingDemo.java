package oops2026;

class Payment {
    void pay(double amount) {
        System.out.println("Generic payment: " + amount);
    }
}

class UpiPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("UPI payment: " + amount);
    }
}

class CardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Card payment: " + amount);
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Payment p;

        p = new UpiPayment();
        p.pay(1000);

        p = new CardPayment();
        p.pay(2000);
    }
}
