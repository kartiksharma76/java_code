package BasicCodingQuestion.oops;

public class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Payment through Credit Card");
    }
}
