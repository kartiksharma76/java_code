package BasicCodingQuestion.string;

public class CountVowCon {
    public static void main(String[] args) {
        String s = "Hello World";
        int v = 0, c = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels = " + v +" : " + "Consonent = " + c);
    }
}
