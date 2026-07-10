package oops;

abstract class Appliance {

    abstract void switchOn();
}

class WashingMachine extends Appliance {

    @Override
    void switchOn() {
        System.out.println("Washing Machine Started");
    }
}

public class AbstractReferenceExample {

    public static void main(String[] args) {

        Appliance appliance = new WashingMachine();

        appliance.switchOn();
    }
}