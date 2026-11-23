package BasicCodingQuestion.string;

public class StringConcatinate {
    public static void main(String[] args) {
        String a = "Hello", b = "World";
        System.out.println(a + " " + b);       // Hello World
        System.out.println(a.concat(b));       // HelloWorld
        System.out.println(String.join("-", a, b));   // Hello-World
    }
}
