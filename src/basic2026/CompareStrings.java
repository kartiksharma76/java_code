package basic2026;


public class CompareStrings {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = "Python";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase("JAVA"));
    }
}
