package oops;

class AnimalOne {

    void show() {
        System.out.println("Animal");
    }
}

class Lion extends AnimalOne {

    void roar() {
        System.out.println("Lion Roars");
    }
}

public class UpcastingExample {

    public static void main(String[] args) {

        AnimalOne obj = new Lion();

        obj.show();
    }
}
