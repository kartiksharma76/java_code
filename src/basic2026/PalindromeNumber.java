package basic2026;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n =    121;
        int temp = n;
        int reverse = 0;

        while (temp > 0){
            reverse = reverse * 10 + temp % 10;
            temp /=10;
        }
        System.out.println(n == reverse
                ? "Palindrome" : "Not palindrome");
    }
}
