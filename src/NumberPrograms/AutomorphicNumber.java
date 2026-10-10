package NumberPrograms;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;

        int digits = String.valueOf(num).length();
        int divisor = (int) Math.pow(10, digits);

        if (square % divisor == num) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
