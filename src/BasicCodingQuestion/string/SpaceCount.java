package BasicCodingQuestion.string;

public class SpaceCount {
    public static void main(String[] args) {
        String s = "I love Java Programming";
        int words = s.trim().split("\\s+").length;
        int chars = s.length();
        int spaces = 0;
        for (char ch : s.toCharArray()) if (ch == ' ') spaces++;
        System.out.println(words + " " + chars + " " + spaces);
    }
}
