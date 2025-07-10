package litcode;
/**
 * public static int trailingZeros(int n)
 * This is a static method that takes an integer n and returns the number of trailing zeroes in n!
 * int count = 0;
 * We initialize a variable count to 0.
 * This will store the total number of times 5 appears as a factor in numbers from 1 to n.
 * while (n >= 5)
 * We loop as long as n is greater than or equal to 5, because any number less than 5 cannot contribute a factor of 5.
 * n /= 5;
 * We reduce n by dividing it by 5.
 * This is done to also count numbers like:
 * 25=52 25=5 2 → contributes 2 fives 125=53 125=5 3 → contributes 3 fives, etc.
 * By dividing n again and again by 5, we are including all higher powers of 5.
 * 
 */
public class FactorialTrailingZero {

    public static int trailingZeros(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Trailing zeroes in " + n + "! = " + trailingZeros(n));
    }
}
