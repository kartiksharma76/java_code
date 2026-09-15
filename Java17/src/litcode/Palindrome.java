package litcode;

public class Palindrome {
	public boolean isPalindrome(int x) {
        int original = x, reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Palindrome sol = new Palindrome();
        int a = 121;  // Single integer
        boolean ret = sol.isPalindrome(a);
        System.out.println("Is number palindrome? " + ret);  // Output: true
    }
}
