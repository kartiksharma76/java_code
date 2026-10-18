package basic2026;


public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;

        if (a >= b && a >= c)
            System.out.println(a);
        else if (b >= c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
