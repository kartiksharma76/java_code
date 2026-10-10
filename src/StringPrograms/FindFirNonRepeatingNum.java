package StringPrograms;

public class FindFirNonRepeatingNum {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 1) {
                System.out.println(" FirstNonRepeatNum :" + ch);
                return;
            }
        }
        System.out.println("No repeating Character");
    }
}
