package oops2026;

abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double lenght;
    private final double width;

    Rectangle(double lenght, double width) {
        if (lenght <= 0 || width <= 0) {
            throw new IllegalArgumentException("Invalid dimensions");
        }
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double area() {
        return lenght * width;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 4);

        s1.display();
        s2.display();
    }
}
