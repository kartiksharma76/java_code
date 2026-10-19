package oops2026;

sealed interface Result permits Success, Failure {
}
record Success(String message) implements Result {
}
record Failure(String error) implements Result {
}
public class SealedClassDemo {
    static void display(Result result) {
        switch (result) {
            case Success s -> System.out.println(s.message());
            case Failure f -> System.out.println(f.error());
        }
    }

    public static void main(String[] args) {
        display(new Success("Operation completed"));
        display(new Failure("Something went wrong"));

    }
}
