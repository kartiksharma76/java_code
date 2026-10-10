package StringPrograms;

public class CountFrequencyCharacter {
    public static void main(String[] args) {
        String str = "banana";
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (frequency[ch] > 0) {
                System.out.println(ch + " = " + frequency[ch]);
                frequency[ch] = 0;
            }
        }
    }
}
