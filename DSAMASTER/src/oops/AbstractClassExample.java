package oops;

abstract class PaymentMethod {

    abstract void pay();

    void receipt() {
        System.out.println("Payment Successful");
    }
}

class CreditCardPayment extends PaymentMethod {

    @Override
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {

        CreditCardPayment payment = new CreditCardPayment();

        payment.pay();
        payment.receipt();
    }
}