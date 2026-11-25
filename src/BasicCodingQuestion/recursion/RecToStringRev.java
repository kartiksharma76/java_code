package BasicCodingQuestion.recursion;

public class RecToStringRev {

    static String rev(String s) {
        if (s.isEmpty()) {
            return "";
        }

        return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(rev("hello"));
    }
}