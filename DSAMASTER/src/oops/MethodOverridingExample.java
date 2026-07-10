package oops;

class Bird {

    void sound() {
        System.out.println("Bird makes sound");
    }
}

class Sparrow extends Bird {

    @Override
    void sound() {
        System.out.println("Sparrow Chirps");
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {

        Sparrow s = new Sparrow();

        s.sound();
    }
}