package oops;

interface Shape1 {

    void draw();
}

class CircleShape implements Shape1 {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class RectangleShape implements Shape1 {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {

    public static Shape1 getShape(String shape) {

        if (shape.equalsIgnoreCase("Circle")) {
            return new CircleShape();
        }

        if (shape.equalsIgnoreCase("Rectangle")) {
            return new RectangleShape();
        }

        return null;
    }
}

public class ShapeFactoryExample {

    public static void main(String[] args) {

        Shape1 shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        Shape1 shape2 = ShapeFactory.getShape("Rectangle");
        shape2.draw();
    }
}
