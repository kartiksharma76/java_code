package StringPrograms;

public class FindRepeatingNum {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;

            if (freq[ch] == 2) {
                System.out.println("First Repeating: " + ch);
                return;
            }
        }

        System.out.println("No Repeating Character");
    }
}

