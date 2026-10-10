package StringPrograms;

public class ReverseEachWords {
    public static void main(String[] args) {
        String str = "Java is easy";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse = reverse + words[i].charAt(j);
            }

            System.out.print(reverse);

            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
