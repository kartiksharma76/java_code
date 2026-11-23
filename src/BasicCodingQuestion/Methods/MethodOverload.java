package BasicCodingQuestion.Methods;

public class MethodOverload {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // add(1, 2) -> 3, add(1.5, 2.5) -> 4.0, add(1, 2, 3) -> 6
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.5, 2.5));
        System.out.println(add(1, 2, 3));
    }
}
