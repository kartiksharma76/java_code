package oopsrealproblem;

class UpiPayment1 implements PaymentMethod1 {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
