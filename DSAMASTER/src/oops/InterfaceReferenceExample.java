package oops;

interface PaymentGateway {

    void pay();
}

class UpiPayment implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}

public class InterfaceReferenceExample {

    public static void main(String[] args) {

        PaymentGateway payment = new UpiPayment();

        payment.pay();
    }
}
