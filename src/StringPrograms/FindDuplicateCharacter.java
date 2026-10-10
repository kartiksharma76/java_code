package StringPrograms;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > 1) {
                System.out.println(ch + " = " + freq[ch]);
                freq[ch] = 0;
            }
        }
    }
}
