package basic2026;


public class LogicalOperators {
    public static void main(String[] args) {
        int age = 22;

        System.out.println(age >= 18 && age <= 60);
        System.out.println(age < 18 || age > 60);
        System.out.println(!(age < 18));
    }
}
