package BasicCodingQuestion.oops;

abstract class AbstractEx {

    abstract void display();

    void show() {
        System.out.println("This is a normal method");
    }
}

class Demo extends AbstractEx {

    @Override
    void display() {
        System.out.println("This is an abstract method");
    }
}


