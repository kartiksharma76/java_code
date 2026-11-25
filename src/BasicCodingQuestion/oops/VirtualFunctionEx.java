package BasicCodingQuestion.oops;

public class VirtualFunctionEx {
    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();
    }
}
