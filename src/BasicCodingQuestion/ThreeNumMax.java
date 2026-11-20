package BasicCodingQuestion;

public class ThreeNumMax {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = 30;

        if (a >= b && a >= c) {
            System.out.println(" a is maximum :" + a);

        } else if (b >= a && b >= c) {
            System.out.println("b is maximum :" + b);

        } else {
            System.out.println("c is maximum :" + c);
        }
    }
}