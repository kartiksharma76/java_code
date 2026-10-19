package oops2026;

interface PaymentMethod {
    void pay(double amount);
}

class Upi implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class Card implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }
}

// High-level code depends on an abstraction.
class CheckoutService {
    private final PaymentMethod paymentMethod;

    CheckoutService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    void checkout(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        paymentMethod.pay(amount);
    }
}

public class SolidDemo {
    public static void main(String[] args) {
        CheckoutService upiCheckout = new CheckoutService(new Upi());
        upiCheckout.checkout(1500);

        CheckoutService cardCheckout = new CheckoutService(new Card());
        cardCheckout.checkout(2500);
    }
}