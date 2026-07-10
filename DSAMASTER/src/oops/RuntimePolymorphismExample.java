package oops;

class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class RuntimePolymorphismExample {

    public static void main(String[] args) {

        Shape s = new Circle();

        s.draw();
    }
}