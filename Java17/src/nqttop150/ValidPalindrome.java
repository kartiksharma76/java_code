package nqttop150;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        boolean result = isPalindrome(s);
        System.out.println("Is valid palindrome? " + result); 
    }
}
